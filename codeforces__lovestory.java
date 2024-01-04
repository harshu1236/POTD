import java.util.Scanner;

public class codeforces__lovestory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String s= sc.next();
            String s1="codeforces";
            int c=0;
            for(int j=0;j<10;j++)
            {
                if(s.charAt(j)!=s1.charAt(j))
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
