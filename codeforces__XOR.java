import java.util.Arrays;
import java.util.Scanner;

public class codeforces__XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            if(n%2!=0)
            {
                Arrays.fill(a,2);
            }
            else
            {
                a[0]=1;
                a[1]=3;
                for(int j=2;j<n;j++)
                {
                    a[j]=2;
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
