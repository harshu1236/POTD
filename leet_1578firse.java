import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leet_1578firse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];


        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(a[i]);
        }

        String s=sc.next();
        int sum=0;
        int i=0,j=1;
        StringBuilder sb=new StringBuilder(s);
        while (j<sb.length())
        {
            if(sb.charAt(i)==sb.charAt(j))
            {
                if(l.get(i)<l.get(j))
                {

                    sum+=l.get(i);
                    sb.deleteCharAt(i);
                    l.remove(i);
                    j=i+1;
                }
                else
                {
                    sum+=l.get(j);
                    sb.deleteCharAt(j);
                    l.remove(j);
                }
            }
            else
            {
                j++;
                i++;
            }
        }
        System.out.println(sum);
    }
}
