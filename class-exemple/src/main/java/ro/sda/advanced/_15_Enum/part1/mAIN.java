package ro.sda.advanced._15_Enum.part1;

public class mAIN {
    public static void main(String[] args) {

        Coffee myCoffee=Coffee.LATE;
        Coffee myOtherCoffee=Coffee.AMERICANO;

        System.out.println(myCoffee);
        System.out.println(myOtherCoffee);

        Coffee enumFromString = Coffee.valueOf("AMERICANO");
        System.out.println(enumFromString);

        System.out.println("LATTE order in enum constant is "+myCoffee.ordinal());
        System.out.println("AMERICANO order in enum constant is "+myCoffee.AMERICANO.ordinal());



    }
}
