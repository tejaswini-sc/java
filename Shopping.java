
import java.util.*;

public class Shopping {
    static boolean search(String items[],String item){
        for(String i:items){
            if(i.equals(item)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of shopping items:");
        int num=sc.nextInt();
        System.out.println("Enter shopping items:");
        String[] items = new String[num];

        for (int i = 0; i < num; i++) {
            items[i] = sc.next();
        }

        System.out.println("Shopping items are:");
        for (int i = 0; i < num; i++) {
            System.out.println(items[i]);
        }
        System.out.println("number of items in list:"+ items.length);

        System.out.println("enter the item to search in the list");
        String item=sc.next();
        if(search(items,item)){
            System.out.print("found");            
        }
        else{
            System.out.print(" not found");
        }

    }
}
