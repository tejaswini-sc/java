public class pgm6 {
    static void pt1()
    {
        int n=5;
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    
    }
    static void pt2()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
           int count=i*(i+1)/2;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count--);
            if(j<=i-1)
            {
                System.out.print("*");
            }
            }
        System.out.println();
        }
    }
    static void pt3(){
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
    static void pt4()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch++ + " ");
            }
        System.out.println();
        }
    }
        static void pt5()
    {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
    pt1();
    System.out.println();
    pt2();
    System.out.println();
    pt3();
    System.out.println();
    pt4();
    System.out.println();
    pt5();
   } 
}
