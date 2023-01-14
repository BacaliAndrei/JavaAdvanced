package ro.sda.advanced._6_array_list;

/**
 * Create a class Item with the following instance variables: name - String, quantity - int, price - double
 * <p>
 * Create the following methods:
 * - constructor (check if the price is greater than 0)
 * - getters for all the fields
 * - setter for price - (check if the price is greater than 0)
 * - incrementQuantity(int quant) - method that adds the parameter "quant" to the field quantity
 * - decrementQuantity(int quant) - method that subtracts the parameter "quant" from the field quantity
 * <p>
 * Create a class ShoppingManager. The class should have 2 lists as instance variables.
 * Both fields are lists of Item. One of them represents store's stock and
 * the other one is the shopping basket of the client.
 * <p>
 * Create the following methods:
 * - constructor without parameters (initialize both lists)
 * <p>
 * - addItemInStock(name, quantity, price) -> in order to add an item we need to check first if the
 * item has not been already added in the store's stock (iterate through the store stock and check item names)
 * if the item was already added just increment the quantity of the already added item and update the price (exit from function after)
 * if the item is not already in the list then add it by creating a new Item
 * <p>
 * - sellItemFromStock(name, quantity) - check if the item is in stock (iterate through the store's stock)
 * and then check if the name parameter is equal to item name (item name from the list)
 * if the item needed is found then check the available quantity
 * return then total price of the sold item (multiply item price with quantity)
 * <p>
 * - addItemToBasket(name, quantity) - check if the item is in store's stock (iterate through the store stock and check item names)
 * if the quantity in stock is greater or equal to the desired quantity then add the item
 * in the basket list by creating a new item (a copy of the one that is in the stock) - exit method for loop after
 * <p>
 * - buyItemsFromBasket() - returns total price of the items
 * iterate through the shopping basket and use sellItemFromStock() method and append the
 * result to a totalPrice variable which will be returned
 * clear the basket
 */
public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;

        if (price < 0) {
            System.err.println("The price must be > 0");
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("The price must be > 0");
        } else {
            this.price = price;
        }
    }

    public int incrementQuantity(int quant) {
        return this.quantity += quant;
    }

    public int decrementQuantity(int quant) {
        return this.quantity -= quant;
    }

    @Override
    public String toString() {
        return this.name + " quantity: " + this.quantity + " price: " + this.price;
    }
}
