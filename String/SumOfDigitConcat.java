package String;
import java.util.Scanner;

public class SumOfDigitConcat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t="";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                sum=sum+(ch-'0');
            }
            else{
                t=t+ch;
            }
        }
        System.out.println(t+sum);
    
    }

}