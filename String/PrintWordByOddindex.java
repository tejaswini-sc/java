import java.util.Scanner;

public class PrintWordByOddindex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i=i+2) {
            String temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}