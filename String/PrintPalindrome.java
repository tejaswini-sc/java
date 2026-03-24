
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
    } 
}
