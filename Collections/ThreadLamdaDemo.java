package Collections;

import java.util.Scanner;

//class adds implements Runnable {
//    @Override
//    public void run() {
//    }      
//}

//class printChars implements Runnable {
//    @Override
//    public void run() {
//        
//    }
//}

public class ThreadLamdaDemo {

	public static void main(String[] args) {
		Thread t =new Thread(()->{
			 Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        System.out.println(a + b);
		});
		Thread t1=new Thread(()->{
			for (char i = 65; i < 70; i++) {
	            System.out.println(i);
	            try {
	                Thread.sleep(3000);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
		});
		
		t.start();
		t1.start();
	}
}
