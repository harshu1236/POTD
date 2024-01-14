import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class leet__942 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        int a[]=new int[sb.length()+1];
        int k=0;
        int p=0;
        int n=sb.length();
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch=='I')
            {
                a[k]=p;
                p++;
                k++;
            }
            else
            {
                a[k]=n;
                n--;
                k++;
            }
        }
        a[k]=p;
        System.out.println(k);
        System.out.println(p);
        System.out.println(Arrays.toString(a));
    }
}
