import java.util.Scanner;

public class codeforces_Digit_Minimization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String s=sc.next();
            if(s.length()==2)
            {
                System.out.println(s.charAt(1));
            }
            else
            {
                int min=Integer.MAX_VALUE;
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)-'0'<min)
                    {
                        min=s.charAt(j)-'0';
                    }
                }
                System.out.println(min);

            }
        }
    }
}
