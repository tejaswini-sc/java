package String;
import java.util.*;

public class CheckEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String c=sc.next();
         String ch=sc.next();
         System.out.println(s.replace(ch, c).toLowerCase());
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count++;
            
        }
        System.out.print("charecter count "+count);

        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                count++;
            }
        }
        System.out.print("numeric count"+count);
    
         String []a=s.split(" ");
         for(String i:a)
         {
             System.out.println(i);
         }
         
         String t = sc.nextLine();
         int n=sc.nextInt();
         System.out.println(s.substring(n));

        System.out.println(s.isEmpty());

         System.out.println(s.charAt(n));
         System.out.println(s.trim());
         int c=s.indexOf(t);
         if(c>=0)
         {
             System.out.print(c);
         }
         else{
             System.out.println(-1);
         }




//         if(s.startsWith(t))
//         {
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }


//         if(s.compareToIgnoreCase(t)>0)
//         {
//             System.out.println("first is greater");
//         }
//         else if(s.compareToIgnoreCase(t)<0)
//         {
//             System.out.print("second is greater");
//         }
//         else{
//             System.out.println("both are equal");
//         }
    }   
}
