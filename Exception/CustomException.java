package Exception;
import java.util.*;
class UnderAgeException extends Throwable{
    @Override
    public String getMessage() {
        return "You are too Young";
    }
}
class OverAgeException extends Throwable{
    @Override
    public String getMessage() {
        return "Your are too old";
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
            else if(age>60){
                throw new OverAgeException();
            }
            else{
                System.out.println("Eligiblity confirm");
            }
        }
        catch(UnderAgeException e){
            System.out.println(e.getMessage());
        }
        catch(OverAgeException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
}