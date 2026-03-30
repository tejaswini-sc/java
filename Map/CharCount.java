import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                if (map.containsKey(ch)) {
                    int count = map.get(ch);
                    map.put(ch, count + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        for (char key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + " ");
        }
    }
}