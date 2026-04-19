package Collections;
import java.util.*;
public class SecLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            l.add(num);
        }
        Collections.sort(l);
        System.out.println("Second largest"+l.get(l.size()-2));

    }
}
