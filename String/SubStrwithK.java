import java.util.*;
public class SubStrwithK {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        for(int i=0;i<=s.length()-k;i++)
        {
            String t="";
            for(int j=i;j<i+k;j++)
            {
                char ch=s.charAt(j);
                t=t+ch;
            }
            System.out.println(t);
        }
    } 
}
