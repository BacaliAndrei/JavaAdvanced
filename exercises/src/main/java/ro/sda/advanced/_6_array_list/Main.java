package ro.sda.advanced._6_array_list;

    public class Main {

        public static void main(String[] args) {

            ShoppingManager shop1 = new ShoppingManager();

            shop1.addItemInStock("Milk", 100, 10);
            shop1.addItemInStock("Meat", 1000, 15);
            shop1.addItemInStock("Apple", 500, 5);
            shop1.addItemInStock("Water", 400, 3);
            shop1.addItemInStock("Milk", 50, 11);

            shop1.addItemToBasket("Meat", 10);
            shop1.addItemToBasket("Water", 20);

            System.out.println("Total price for my basket is: " + shop1.buyItemsFromBasket());

        }
    }

