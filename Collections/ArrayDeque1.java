package Collections;
import java.util.*;

public class ArrayDeque1 {

	public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        // dq.add("1AC");
        // dq.add("2AC");
        // dq.add("3AC");

        // dq.addFirst("VIP");
        // System.out.println(dq);

        // System.out.println(dq.removeLast());
        //         System.out.println(dq);

        // dq.add("Google");
        // dq.addLast("Youtube");
        // dq.addLast("Linkdin");
        // System.out.println(dq);
        // System.out.println(dq.removeLast());
        // System.out.println(dq);

        dq.add("BTM");
        dq.add("Silk board");
        // dq.add("Electronic city");
        dq.addFirst("emergency stop");
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
         System.out.println(dq.peekLast());


        dq.add("A");
        dq.add("B");
        dq.add("c");
        System.out.println(dq);
        dq.removeLast();
        dq.removeLast();
        System.out.println(dq);
	}
}
