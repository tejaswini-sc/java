import java.util.Scanner;

public class MoveNumEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s="";
        String t="";
        
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                t=t+ch;
            }
            else{
                s=s+ch;
            }
        }
      
    }
}