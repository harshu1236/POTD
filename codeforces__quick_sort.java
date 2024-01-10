import java.util.Scanner;

public class codeforces__quick_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n= sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int p=1,c=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==p)
                {
                    p++;
                }
                else
                {
                    c++;
                }
            }
            System.out.println((c+k-1)/k);
        }

    }
}
