import java.util.*;

public class RemoveDupChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Use TreeSet to store sorted unique characters
        TreeSet<Character> set = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (Character x : set) {
            System.out.print(x + " ");
        }
    }
}