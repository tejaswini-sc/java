package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        try{
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]={1,2,3,4,5};
            String s= sc.nextLine();
            int index=sc.nextInt();      
            System.out.println(b[index]);
            System.out.print(s.charAt(index));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("invalid index for string");
        }
        catch(InputMismatchException e){
            System.out.println("enter valid input");
        }
        // catch(NegativeArraySizeException e){
        //     System.out.println("Array size cannot be negative");
        // }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index not found");
        }
    }
}
