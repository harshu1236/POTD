import java.util.*;
import java.lang.*;
import java.io.*;

class gfg {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Compute obj = new Compute();
            System.out.println(obj.minMoves(a, n, m));
        }
    }
}
class Compute {

    public long minMoves(long a[], long n, long k) {
        long c=0;int j=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                if(a[i+1]-a[i]<=k)
                {
                    a[i+1]=a[i+1]-k;
                    c++;
                }
                else
                {
                   while(a[i+1]-a[i]>=k)
                   {
                       if(a[i+1]-(k*j)<=a[i])
                       {
                           a[i+1]=a[i+1]-(k*j);
                           c++;
                       }
                       else
                       {
                           c++;j++;
                       }
                   }
                }
            }
        }
        return c;

    }
}