import java.util.Scanner;

public class codeforces__Cypher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                int p=sc.nextInt();
                String s=sc.next();
                for (int k=0;k<p;k++)
                {
                    char ch=s.charAt(k);
                    if (ch=='U')
                    {
                        if(a[j]==0)
                        {
                            a[j]=9;
                        }
                        else
                        {
                            --a[j];
                        }
                    }
                    else
                    {
                        if(a[j]==9)
                        {
                            a[j]=0;
                        }
                        else
                        {
                            ++a[j];
                        }
                    }
                }
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
