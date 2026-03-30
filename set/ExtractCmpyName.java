import java.util.Scanner;
import java.util.TreeSet;

public class ExtractCmpyName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String urls[]=s.split(",");
        TreeSet<String> set=new TreeSet<>();
        for (String url : urls) {
            url = url.trim();
            url = url.replace("http://", "")
                     .replace("https://", "");
            url=url.replace("www.", "");
            String domain = url.split("/")[0];
            String company = domain.split("\\.")[0];

            set.add(company);
        }
        for(String x:set){
            System.out.println(x);
        }
    }
}
