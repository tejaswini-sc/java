import java.util.Scanner;

class OddSubArrya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int size=1;size<=a.length;size++)
        {
            if(size%2 !=0)
            {
                for(int i=0;i<a.length-size;i++)
                {
                    for(int j=i;j<i+size;j++)
                    {
                        System.out.print(a[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
