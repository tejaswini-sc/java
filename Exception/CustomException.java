package Exception;
import java.util.*;
class UnderAgeException extends Throwable{
    @Override
    public String getMessage() {
        return "You are too Young";
    }

}
class CustomException{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        try{
            int age=sc.nextInt();
            if(age<18){
                throw new UnderAgeException();
            }
        }
        catch(UnderAgeException e){
            System.out.println(e.getMessage());
        }
    }
    
}