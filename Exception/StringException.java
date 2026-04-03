package Exception;

import java.util.Scanner;

public class StringException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int index=sc.nextInt();
        try{
            System.out.print(s.charAt(index));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("invalid index for string");
        }
    }
}
