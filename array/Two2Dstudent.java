import java.util.Scanner;

public class Two2Dstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m]; 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("do you want to print yes/no");
        String choice = sc.next();
        if(choice.equals("Yes"))
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        else
        {
            System.out.println("thank you");
        }
    }
}
