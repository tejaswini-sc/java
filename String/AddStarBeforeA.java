
package String;
import java.util.Scanner;

public class AddStarBeforeA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = "";

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch == 'a') {
                result = result + "*a";
            } else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}