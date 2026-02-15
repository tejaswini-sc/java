package Patternprogramming;
public class Assignment {

    static void pt1()
    {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(j+1);
                }
                else{
                    System.out.print("1");
                }   
            }
            System.out.println();
        }
    }
    static void pt2(){
        int n=5;
        for(int i=0;i<n;i++){
            // int count=i+1;
            for(int j=0;j<n;j++){
                if(j<=i){
                    System.out.print(i+1);
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
       static void pt3(){
        int n=5;
        for(int i=0;i<n;i++){
            // int count=i+1;
            for(int j=0;j<n;j++){
                if(j<=i){
                    System.out.print(j+1);
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    static void pt4(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=0;j<n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
     static void pt5(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pt6(){
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                if((i+j)%2==0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
                System.out.println();
        }
    }
        static void pt7(){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void pt8(){
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(i+1);
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void pt9(){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pt10()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-i+1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pt13()
    {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pt1();
    // OUTPUT
    // 11111
    // 12111
    // 11311
    // 11141
    // 11115
        System.out.println();
        pt2();
    // OUTPUT
    // 11111
    // 22111
    // 33311
    // 44441
    // 55555
        System.out.println();
        pt3();
    // OUTPUT
    // 11111
    // 12111
    // 12311
    // 12341
    // 12345

        System.out.println();
        pt4();
    // OUTPUT
    // 5 5 5 5 5
    // 4 4 4 4 4
    // 3 3 3 3 3
    // 2 2 2 2 2
    // 1 1 1 1 1
        System.out.println();
        pt5();
    // OUTPUT
    // 5 4 3 2 1 
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
        System.out.println();
        pt6();
    // OUTPUT
    // 01010
    // 10101
    // 01010
    // 10101
    // 01010
        System.out.println();
        pt7();
    // OUTPUT
    // 11111
    // 01111
    // 00111
    // 00011
    // 00001
        System.out.println();
        pt8();
    // OUTPUT
    // 10000
    // 02000
    // 00300
    // 00040
    // 00005
        System.out.println();
        pt9();
    // OUTPUT
    //     1
    //    12
    //   123
    //  1234
    // 12345
        System.out.println();
        pt10();
    // OUTPUT
    //     5
    //    45
    //   345
    //  2345
    // 12345
        System.out.println();    
        pt13();
    // OUTPUT
    //     A
    //    B B
    //   C C C
    //  D D D D
    // E E E E E

    }
    
}
