import java.util.Scanner;

public class LargestRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int repeat=-1;
        int min=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=a.length-1;i>=1;i--)
        {
            if(a[i]==a[i-1])
            {
                repeat=a[i];
                found=true;
                System.out.print(repeat);

                break;
            }
            
        }
        if(!found)
            System.out.print(repeat);

    }
}