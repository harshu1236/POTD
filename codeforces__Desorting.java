import java.util.Arrays;
import java.util.Scanner;

public class codeforces__Desorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            boolean b=true;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    b=false;
                    break;
                }
            }
            int min=Integer.MAX_VALUE;
            if(b==true)
            {
                for(int i=0;i<n-1;i++)
                {
                    int diff=a[i+1]-a[i];
                    min=Math.min(diff/2+1,min);

                }
                System.out.println(min);
            }
            else
            {
                System.out.println(0);
            }
        }



    }
}
