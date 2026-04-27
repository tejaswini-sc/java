import java.util.Scanner;

class add extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}

class printChar extends Thread {
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

public class TreadDemo extends Thread {
    public static void main(String[] args) {
        add a=new add();
        printChar pc=new printChar();
        a.start();
        pc.start();

    }
}
