interface OperatingSystem{
    void boot();
    void shotDown();
}
interface Macos implements OperatingSystem{
    @Override
    void boot(){
        System.out.print("booting");
    }
}
public class Os {
    public static void main(String args[]){
        Macos m=new Macos();
        m.boot();

    }
}
