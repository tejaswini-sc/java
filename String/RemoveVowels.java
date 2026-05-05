import java.util.Scanner;
public class RemoveVowels {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String t="";
        for(int i=0;i<input.length();i++)
        {
            char ch=input.toLowerCase().charAt(i);
   
            if(ch!='a'&& ch!='e'&& ch!='i' && ch!='o' && ch!='u' && ch!='A'&& ch!='E'&& ch!='I' && ch!='O' && ch!='U')            
            {
                t=t+ch;
            }
            
        }
        System.out.println(t);
      
    }    
}



