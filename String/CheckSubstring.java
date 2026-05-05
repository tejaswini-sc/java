import java.util.Scanner;

class CheckSubstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        int size=s2.length();
        int count=0;
        for(int i=0;i<s.length()-size;i++)
        {
            String t="";
            for(int j=i;j<i+size;j++)
            {
                t=t+s.charAt(j);
            }
            if(t.equals(s2))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}