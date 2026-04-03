package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        try{
             String s= sc.nextLine();
            int index=sc.nextInt();      
            System.out.print(s.charAt(index));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("invalid index for string");
        }
        catch(InputMismatchException e){
            System.out.println("enter valid input");
        }
    }
}
