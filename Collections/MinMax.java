package Collections;
import java.util.ArrayList;
import java.util.Scanner;

class MinMax
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            l.add(num);
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(l.get(i)<min){
                min=l.get(i);
            }
            if(l.get(i)>max){
                max=l.get(i);
            }
        }
        System.out.println("minimum"+min);
        System.out.println("max"+max);
    }
}