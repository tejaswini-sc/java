public class pgm5 {

    static void pattern(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j+1);
            }
        System.out.println();
        }
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
        int n=10;
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<(n-1)-k;i++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=k;j++)
            {
                System.out.print(" "+" *");
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
                if(j==0 || j==i || i==(n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void numtri(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    static void holenumtri(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0 || j==i || i==(n-1) ){
                    System.out.print(j+1 +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void rightangletri(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if (j==0 || j==i || i==n-1) {
                    System.out.print(j+1 + " ");    
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
    static void numtriangle(){
        int n=5;
        for(int i=0;i<=n;i++){
            int count=i;
            for(int j=0;j<i;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
    static void upsidetri(){
        int n=5;
        for(int i=1;i<=n;i++){
            int count=i;
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    static void holeupsidetri(){
        int n=5;
        for(int i=1;i<=n;i++){
            int count=i;
            for(int j=1;j<=(n-i)+1;j++){
                if(j==1|| i==1 || j==(n-i)+1){
                    System.out.print(count++ + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }
    static void pt1(){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pt2(){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pt3(){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
        pattern();
        System.out.println();
        holo();
        System.out.println();
        num();
        System.out.println();
        mulnum();
        System.out.println();
        num1();
        System.out.println();
        triangle();
        System.out.println();
        trianglenum();  
        System.out.println();
        revtriangle();  
        System.out.println();
        equaltri();
        System.out.println();
        holetri();    
        System.out.println();
        numtri();
        System.out.println();
        holenumtri();
        System.out.println();
        rightangletri();
        System.out.println();
        numtriangle();
        System.out.println();
        upsidetri();
        System.out.println();
        holeupsidetri();
        System.out.println();
        pt1();
        System.out.println();
        pt2();
        System.out.println();
        pt3();
        System.out.println();
        pt4();

    }
}
