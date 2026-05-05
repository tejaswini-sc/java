package Collections;
import java.util.*;
class Bus{
	private int busNo;
	private String busRoute;
	
	public Bus(int busNo,String busRoute)
	{
		this.busNo=busNo;
		this.busRoute=busRoute;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}
	
	
	
}

public class BusSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		String s=sc.nextLine();
		String a[]=s.split(",");
		Bus []e=new Bus[n];
		for(int i=0;i<n;i++) {
			e[0]=a[0];
			
		}
		
		
	}

}
