package Collections;
import java.util.*;
public class BusRouteManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		LinkedList<String> stop=new LinkedList<>();
		stop.add("Majestic");
		stop.add("btm");
		stop.add("silk board");
		stop.add("electronic city");
		int choice;
		do {
			System.out.println("bus route menu");
			System.out.println("1. Add Stop");
            System.out.println("2. Remove Stop");
            System.out.println("3. Search Stop");
            System.out.println("4. Display Stops");
            System.out.println("5. Update Stop");
            System.out.println("6. Extra gOperations");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice) {
            case 1: 
            	System .out.print("1.add first \n 2 add last \n 3:add at position\n");
            	int addchoice=sc.nextInt();
            	sc.nextLine();
            	System.out.println("enter stop name");
            	String stopname=sc.nextLine();
            	if(addchoice==1) {
            		stop.addFirst(stopname);          		
            	}
            	else if(addchoice==2) {
            		stop.addLast(stopname);
            	}
            	else if(addchoice==3) {
            		System.out.println("enter position");
            		int pos=sc.nextInt();
            		stop.add(pos, stopname);
            	}
            	break;
            case 2:
            	System.out.println("1:remove first\n 2:remove last \n 3: remove by name");
            	int removech=sc.nextInt();
            	sc.nextLine();
            	if(removech==1) {
            		stop.removeFirst();
            	}
            	else if(removech==2) {
            		stop.removeLast();
            	}
            	else if(removech==3) {
            		System.out.println("enter stopname");
            		String removestop=sc.nextLine();
            		stop.remove(removestop);
            	}
            	break;
            case 3:
            	System.out.println("enter stop to search");
				String search=sc.nextLine();
				if(stop.contains(search)){
					System.out.println("found at index"+stop.indexOf(search));
				}
				else{
					System.out.println("stop not found");
				}
				break;
			case 4:
				System.out.println("stops");
				for(int i=0;i<stop.size();i++){
					System.out.println(stop.get(i));
				}
            
            case 5:
				System.out.println("exiting....");
				break;
			default:
				System.out.println("invalid");
			}
		}while (choice!=7);
		sc.close();
		
	}

}
