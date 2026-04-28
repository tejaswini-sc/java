import java.util.Scanner;

class adds implements Runnable {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}

class printChars implements Runnable {
    @Override
    public void run() {
        for (char i = 65; i < 70; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class TreadDemo1{
    public static void main(String[] args) {
        adds a = new adds();
        printChars pc = new printChars();
        Thread t= new Thread(a);
        t.start();
        Thread t1= new Thread(pc);
        t1.start();

    }
}
