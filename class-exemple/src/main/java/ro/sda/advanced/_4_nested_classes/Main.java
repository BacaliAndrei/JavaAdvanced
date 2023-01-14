package ro.sda.advanced._4_nested_classes;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Greeters.ROMANIAN_GREETING);
//        System.out.println(Greeters.PORTUGUESE_GREETING);

        Greeters.Romanian romanian=new Greeters.Romanian();
        romanian.greet();


       Greeters greeters=new Greeters();

        Greeters.Portuguese portuguese=new Greeters.Portuguese();
        portuguese.greet();

    }
}

class Greeters{


    public static String ROMANIAN_GREETING="Buna ziua!";
    public static String PORTUGUESE_GREETING="Ola!";

    static class Romanian{
        public void greet(){
            System.out.println(ROMANIAN_GREETING);
        }
    }
    static class Portuguese{
        public void greet(){
            System.out.println(PORTUGUESE_GREETING);
        }
    }

}