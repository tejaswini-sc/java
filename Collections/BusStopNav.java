package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class BusStopNav {
    public static void main(String[] args) {
        // ArrayList<String> stop=new ArrayList<>();
        // stop.add("Btm");
        // stop.add("Silk Board");
        // stop.add("Electronic city");
        // stop.add("Hebbal");
        // stop.add("Majestic");
        // System.out.println(stop);

        // int current=0;
        // System.out.println("Start "+stop.get(current));
        // current++;
        // System.out.println("next "+stop.get(current));
        // current++;
        // System.out.println("Next "+stop.get(current));
        // current--;
        // System.out.println("previous "+stop.get(current));

        // System.out.println("removed "+stop.remove(3));

        // System.out.println("emergency stop");
        // stop.addFirst("Airport");
        // stop.addLast("AirPort");
        // System.out.println(stop);


        // LinkedList<String> s=new LinkedList<>();
        // s.add("Btm");
        // s.add("Silk Board");
        // s.add("Electronic city");
        // s.add("Hebbal");
        // s.add("Majestic");    
        // System.out.println(s);
        // int c=0;

        // System.out.println("first "+s.get(c));
        // c++;
        // System.out.println("next "+s.get(c));
        // c++;
        // System.out.println("next "+s.get(c));
        // c--;
        // System.out.println("previous "+s.get(c));
        
        // System.out.println("removed "+s.remove(3));
        // s.addFirst("airport");
        // s.addLast("Airport");
        
        // System.out.println(s);


        ArrayDeque <String> route =new ArrayDeque<>();
        ArrayDeque <String> history=new ArrayDeque<>();
        history.offer("btm");
        history.offer("silk board");
        history.offer("electroni city");
        history.offer("hebbal");
        history.offer("majestic");
        System.out.println(history);      
       System.out.println("Current: " + route.peekFirst());

history.addLast(route.removeFirst());
System.out.println("After move: " + route.peekFirst());

history.addLast(route.removeFirst());
System.out.println("After move: " + route.peekFirst());

route.addFirst(history.removeLast());
System.out.println("After back: " + route.peekFirst());
        

        // System.out.println(route);
    }
}
