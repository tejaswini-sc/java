import java.util.Scanner;

public class ReplaceKValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char k=sc.next().charAt(0);
        String result = "";

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch == k) {
                result = result + "*";
            } else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}