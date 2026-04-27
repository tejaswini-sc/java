import java.util.Scanner;

class add extends Thread{
    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }
}

public class TreadDemo extends Thread {
    public static void main(String[] args) {
        add a=new add();
        a.start();

    }
    
}
