import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[2][5];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("enter "+ i +"th rows " +j+ " th column");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("arrays values are");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
