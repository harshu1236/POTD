import java.util.Arrays;
import java.util.Scanner;

public class leet__905 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
