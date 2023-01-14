package ro.sda.advanced._15_Enum.part2;

public class Main {
    public static void main(String[] args) {

        Coffee latte=Coffee.LATE;
        System.out.println("LATTE order in enum constant is "+latte.ordinal());
        System.out.println("The following coffee "+latte+" has price "+latte.getPrice()+
                " and description: "+latte.getDescription());

        System.out.println("The following coffee "+Coffee.AMERICANO+" has price "+Coffee.AMERICANO.getPrice()+
                " and description: "+Coffee.AMERICANO.getDescription());

    }
}
