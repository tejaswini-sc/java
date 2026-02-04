public class Assignment {

    // static void pt2(){
    //     int n=5;
    //     for(int i=0;i<n;i++){
    //         // int count=i+1;
    //         for(int j=0;j<n;j++){
    //             if(j<=i){
    //                 System.out.print(i+1);
    //             }
    //             else{
    //                 System.out.print("1");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    //    static void pt3(){
    //     int n=5;
    //     for(int i=0;i<n;i++){
    //         // int count=i+1;
    //         for(int j=0;j<n;j++){
    //             if(j<=i){
    //                 System.out.print(j+1);
    //             }
    //             else{
    //                 System.out.print("1");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
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
        // System.out.println();
        // pt2();
        // System.out.println();
        // pt3();
    }
    
}
