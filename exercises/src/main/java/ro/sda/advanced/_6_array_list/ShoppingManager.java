package ro.sda.advanced._6_array_list;

import java.util.ArrayList;

public class ShoppingManager {
    ArrayList<Item> storeStock;
    ArrayList<Item> shoppingBasket;

    public ShoppingManager() {
        this.storeStock = new ArrayList<>();
        this.shoppingBasket = new ArrayList<>();

    }

    public void addItemInStock(String name, int quantity, double price) {
        for (Item el : storeStock) {
            if (el.getName().equals(name)) {
                el.incrementQuantity(quantity);
                el.setPrice(price);
                return;
            }
        }
        storeStock.add(new Item(name, quantity, price));

    }

    public double sellItemFromStock(String name, int quantity) {

        for (Item el : storeStock) {
            if (el.getName().equals(name)) {
                if (el.getQuantity() >= quantity) {
                    el.decrementQuantity(quantity);
                    return el.getPrice() * quantity;
                } else {
                    System.err.println("Quantity not available");
                }
            }
        }
        return -1;

    }

    public void addItemToBasket(String name, int quantity) {
        for (Item el : storeStock) {
            if (el.getName().equals(name)) {
                shoppingBasket.add(new Item(name, quantity, el.getPrice()));
                break;
            } else {
                System.err.println("Quantity not available");
            }
        }

    }

    public double buyItemsFromBasket() {
        double totalPrice = 0;
        for (Item el : shoppingBasket) {
            totalPrice += sellItemFromStock(el.getName(), el.getQuantity());
        }
        shoppingBasket.clear();
        return totalPrice;
    }


}
