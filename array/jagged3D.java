import java.util.Scanner;

public class jagged3D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][][]=new int[2][][];
        for(int i=0;i<2;i++)
        {
            System.out.println("enter class values"+i);
            int n=sc.nextInt();
            a[i]=new int[n][];
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println("enter class "+i+" student values "+j);
                int m=sc.nextInt();
                a[i][j]=new int[m];
                for(int k=0;k<a[i][j].length;k++)
                {
                    System.out.print("school "+i+" class "+j+" student "+k);
                    a[i][j][k]=sc.nextInt();
                }
            }

        }
        // a[0]=new int[2][];
        // a[1]=new int[3][];
        // a[0][0]=new int[5];
        // a[0][1]=new int[4];
        // a[1][0]=new int[3];
        // a[1][1]=new int[2];
        // a[1][2]=new int[6];

        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<a[i].length;j++)
        //     {
        //         for(int k=0;k<a[i][j].length;k++)
        //         {
        //             System.out.print("school "+i+" class "+j+" student "+k);
        //             a[i][j][k]=sc.nextInt();
        //         }
        //     }
        // }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }   
}
