import java.util.Scanner;

class reverseFirstlast{
    static void reverse(String s){
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        String t= "";
        String mid=s.substring(1,s.length()-1);
        System.out.print(last+mid+first+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++){
          reverse(a[i]);
        }
        // reverse(s);
    }
}