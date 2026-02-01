public class pgm2 {

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
    }
}
