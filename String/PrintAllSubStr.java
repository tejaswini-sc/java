import java.util.*;
public class PrintAllSubStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int len=1;len<=s.length();len++)
        {
            for(int i=0;i<=s.length()-len;i++)
            {
                String t="";
                for(int j=i;j<len+i;j++)
                {
                    t=t+s.charAt(j);
                }
                System.out.println(t);
            }
        }
            
    }
}
