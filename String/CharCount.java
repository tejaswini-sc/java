import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z') && !(ch>='0' && ch<='9') && ch!=' ')
            {
                count++;
            }
        }        
            System.out.print(count);   
            s.stripLeading();
            s.stripTrailing();

    }
}


    
