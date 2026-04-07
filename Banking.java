import java.util.*;

class PinInvalidException extends Exception{
    @Override
    public String getMessage(){
        return "Invalid Pin";
    }
}

class Atm{
    int pin=7000;
    int bal=10000;
    int enteredpin;
    Scanner sc =new Scanner(System.in);
    void acceptInput(){
        System.out.println("Enter pin");
        enteredpin=sc.nextInt();
    }
    void verify() throws Exception{
        if(pin==enteredpin){
            System.out.println("your bal is"+bal);
        }
        else{
            System.out.println("invalid pin");
            throw new PinInvalidException();

        }
    }
}

class Bankk{
    void init()
    {
        Atm a=new Atm();
        a.acceptInput();
       try{
         a.verify();
       }
       catch(Exception e)
       {
        System.out.println(e.getMessage());
        a.acceptInput();
        try{
            a.verify();
        }catch(Exception e1)
        {
            System.out.println(e1.getMessage());
            a.acceptInput();
            try{
            a.verify();
        }catch(Exception e2)
        // {
        //     System.out.println(e2.getMessage());
        //     a.acceptInput();

        // }
        }
       }
    }
}
class Banking{
    public static void main(String[] args) {
     Bankk b= new Bankk();
     b.init();   
    }
}