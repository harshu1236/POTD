import java.util.*;

public class leet__1877 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        int i=0,j=n-1;
        int max=Integer.MIN_VALUE;
        while(i<j)
        {
            max=Math.max(max,a[i]+a[j]);
            i++;
            j--;
        }
        System.out.println(max);
    }
}
