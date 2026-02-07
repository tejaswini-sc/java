public class Assignment {

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
        System.out.println();
        pt2();
        System.out.println();
        pt3();
        System.out.println();
        pt4();
        System.out.println();
        pt5();
        System.out.println();
        pt6();
    }
    
}
