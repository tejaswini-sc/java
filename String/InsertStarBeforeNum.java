import java.util.Scanner;

public class InsertStarBeforeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                t=t+'*'+ch;
            }
            else{
                t=t+ch;
            }
        }
        System.out.println(t);
    
    }

}