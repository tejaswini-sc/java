package String;
import java.util.*;
public class LengthString {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      String word= sc.nextLine();
      String word1= sc.nextLine();
      
      System.out.print(word.length());
      System.out.print(word.toUpperCase());
      System.out.print(word.equalsIgnoreCase(word1));
      
    }    
}

