import java.util.*;;
public class VowelConontantSpcChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int Vcount=0;
        int Ccount=0;
        int Ncount=0;
        int Sc=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                   ch=='A' || ch=='E' || ch=='I'|| ch=='O' ||ch=='U' 
                   )
                   {
                    Vcount++;
                   }
                   else{
                    Ccount++;
                   }
            }
            else if(ch>='0' && ch<='9')
            {
                Ncount++;
            }
            else{
                Sc++;
            }
        }
        System.out.println("Vowels: "+Vcount);
        System.out.println("Consonants: "+Ccount);
        System.out.println("Special Characters: "+Sc);
        System.out.println("Numeric count: "+Ncount);
        

    }

}
