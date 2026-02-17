package Patternprogramming;
public class pgm2 {

    static void pattern(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j+1);
            }
        System.out.println();
        }
    }

    static void pattern1()
    {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
        
    }
    static void holo(){
        // int n=5;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 || i==4 || j==0 ||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void num(){
        int count=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    static void mulnum(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i*j<10){
                    System.out.print("0");
                }
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
    static void num1(){
        for(int i=0;i<5;i++){
            int count = i+1;
            for(int j=0;j<5;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    static void triangle(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void trianglenum(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void revtriangle(){
        int n=5;
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<(n-1)-k;i++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=k;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void equaltri(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void holetri(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0 ||j==i || i==n-1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String swapna[]){
        pattern();
        //output
        // 12345
        // 12345
        // 12345
        // 12345
        // 12345
        System.out.println();
        pattern1();
        //output
        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
        System.out.println();
        holo();
        //output
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        System.out.println();
        num();        
        //output
        // 01 02 03 04 05 
        // 06 07 08 09 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25

        System.out.println();
        mulnum();
        //output
        // 01 02 03 04 05
        // 02 04 06 08 10 
        // 03 06 09 12 15 
        // 04 08 12 16 20
        // 05 10 15 20 25
        System.out.println();
        num1();
        //output
        // 1 2 3 4 5
        // 2 3 4 5 6
        // 3 4 5 6 7
        // 4 5 6 7 8
        // 5 6 7 8 9

        System.out.println();
        triangle();
        //output
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println();
        trianglenum();  
        //output
        // 1
        // 12
        // 123
        // 1234
        // 12345
        System.out.println();
        revtriangle();   
        //output
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
   
        System.out.println();
        equaltri();
        //output
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        System.out.println();
        holetri();
        //output
        //     *
        //    * *
        //   *   *
        //  *     *
        // * * * * *
    }
}


