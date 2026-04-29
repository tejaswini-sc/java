package Thread;

import java.util.Scanner;

public class ThreadLamdaDemo {

	public static void main(String[] args) {

		Thread t =new Thread(()->{
			
			Scanner sc=new Scanner(System.in);
			System.out.println(sc.nextInt()+sc.nextInt());
		});

		Thread t1 = new Thread(()->{
			for(char i=65;i<71;i++){
				System.out.println("Task 2: "+i);
				try{
					Thread.sleep(2000);
				}
				catch(Exception e){
					e.printStackTrace();
				}

			}
		});

		
		t.start();
		t1.start();
	}
}
