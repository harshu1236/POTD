import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       StringBuilder sb=new StringBuilder(sc.next());
        StringBuilder sb1=new StringBuilder();
       for (int i=0;i<sb.length();i++)
       {
           char ch=sb.charAt(i);
           if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='y'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!='Y')
           {
               ch=Character.toLowerCase(ch);
               sb1.append(".");
               sb1.append(ch);
           }
       }
        System.out.println(sb1);

    }
}
