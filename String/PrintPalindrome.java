
import java.util.*;
public class PrintPalindrome {


    static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    static void largestLpalindrome(String s){

        for(int len=s.length()-1;len>=0;len--)
        {
            for(int i=0;i<s.length()-len;i++)
            {
                String t="";
                for(int j=i;j<len+i;j++)
                {
                    char ch=s.charAt(j);
                    t=t+ch;
                }
                // System.out.println(t);
                if(isPalindrome(t))
                {
                    System.out.println(t);
                    return;
                }
            }
        }
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
            if(isPalindrome(t))
                System.out.println(t);
        }
        System.out.println("largest palindrome");
        largestLpalindrome(s);
    } 
}
