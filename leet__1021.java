import java.util.Scanner;

public class leet__1021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        String s1="";
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                ++c;++x;
                //System.out.println(c);
            }
            else
            {
                --c;
               if(c<0)
                   c=0;
               if(c==0)
                   x=0;
            }
            if(c>=1&&x>1)
            {
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }
}
