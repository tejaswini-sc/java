import java.util.*;
public class PrintWords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ar[]=s.split(" ");
        int min=Integer.MAX_VALUE;
        String t="";
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i].length()<min)
            {
                min=ar[i].length();
                t=ar[i];
            }
        }
        System.out.println(t);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }   
}
