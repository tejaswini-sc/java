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
    }
}
