class Pgm1{
    public static void main(String...args) {
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
}