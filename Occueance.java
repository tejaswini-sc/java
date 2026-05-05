import java.util.HashMap;
import java.util.*;
class Occueance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch,count+1);
            }   
            else{
                map.put(ch,1);
            }
         }
         for(char x:map.keySet()){
            int value=map.get(x);
            if(value>1){
                System.out.println(x+": "+value);
            }
         }
    }
}