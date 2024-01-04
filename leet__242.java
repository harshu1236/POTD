

import java.util.Scanner;

public class leet__242 {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    leet__242 obj=new leet__242();
        System.out.println(obj.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int a[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            a[t.charAt(i)-'a']--;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
                return false;
        }
        return true;
    }

}
