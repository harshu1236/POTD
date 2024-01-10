import java.util.*;
public class codeforces__File_Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder(sc.next());
        int c=0,s=0;
        for(int i=0;i<n;i++)
        {
            char ch=sb.charAt(i);
            if(ch=='x')
            {
                c++;
            }
            else if(c>=3)
            {
                s+=c-2;
                c=0;
            }
            else
            {
                c=0;
            }
        }
        if(c>=3)
        {
            s+=c-2;
        }
        System.out.println(s);

    }
}
