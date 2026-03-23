package String;
import java.util.*;
public class PrintPalindrome {


    static void isPalindrome(String s)
    {
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        for(int i=0;i<=s.length()-k;i++)
        {
            String t="";
            for(int j=i;j<i+k;j++)
            {
                char ch=s.charAt(j);
                t=t+ch;
            }
            if(isPalindriome(t))
                System.out.println(t);
        }
    } 
}
