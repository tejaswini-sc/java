import java.util.Scanner;

public class SmallRepElem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int min=-1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                min=a[i];
                break;
            }
        }
        System.out.print(min);
        
    }
}