package ro.sda.advanced._8_hashmap;
 /*
          * Create a class StockItem that has a "name" which is a String and "price" which is a double
          a "quantityInStock" which is an int and a "reserved" which is also an int

          The class should contain the following methods:
          - a constructor that takes name, price and quantityInStock as parameters and initialize the fields and (reserved is initialized with 0)
          - getName() - getter for name
          - getPrice() - getter for price
          - setPrice(price) - setter for price (the price is set if and only if the new price is grater then 0.0)
          - availableQuantity() - returns the available quantity by subtracting "reserved" from quantityInStock
          - adjustStock(quantity) - adjust the quantityInStock (it could add or subtract also) - check if the new quantity will be greater or equal to 0
          - reserveStock(quant) - check if quant is lower or equal to availableQuantity() and if it is then add the quant to reserved (return reserved quant)
          - unreserveStock(quant) - check if quant is lower or equal the reserved and if it is then subtract quant from reserved (return unreserved quant)
          - finalizeStock(quant) - check if quant is lower or equal then reserved and if it is then subtract quant from quantityInStock and also subtract it from reserved (return quant)
          - toString() - override


          * Create a class StockManager which has only one field (instance variable) which is a final Map<String, StockItem>

          The class should contain the following methods:
          - a constructor which don't take any parameter but initialize the map with a new HashMap<>()
          - addStock(StockItem item) - check if item is not null, then check if the key (item name) already exists in the map,
          if exists adjustQuantity() if not add the item to the list by putting the name as key and item as value
          - reserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
          if the item is in the map and quant is grater then 0 then call the method reserveStock(quant) for that item
          - sellStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
          if the item is in the map and quant is grater then 0 then call the method finalizeStock(quant) for that item
          - unreserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
          if the item is in the map and quant is grater then 0 then call the method unreserveStock(quant)
          - get(String key) - returns if a StockItem is in the map (map.get(key))
          - toString() - override to print the stock list (use map.entrySet() to iterate through map entries)
          The to string should return:
          "Stock List:
          milk : price 1.26. reserved: 0. There are 6306 in stock. Value of items: 7945.56
          Total stock value 7945.56"

        */


import java.util.HashMap;
import java.util.Map;

public class StockItem {

    private String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public int availableQuantity() {
        return this.quantityInStock - this.reserved;

    }


    //   StockItem{name : Milk, price: 1.2 , quantityInStock : 100 ; reserved:0}

    // adjustStock(-150)

    // newQuantity = 100 - 150 ==> -50


    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity > 0) {
            this.quantityInStock = newQuantity;
        } else {
            System.out.println("Quantity not available!");
        }
    }

    // StockItem{name : Milk, price: 1.2 , quantityInStock : 100 ; reserved:50}
    // .reserveStock(100) ==> NU SE POATE PT CA DEJA AVEM REZERVAT 50

    // StockItem{name : Milk, price: 1.2 , quantityInStock : 100 ; reserved:50}
    // .reserveStock(10) ==>
    // StockItem{name : Milk, price: 1.2 , quantityInStock : 100 ; reserved:60}
    //

    public int reserveStock(int quantityToReserve) {
        int availableQuantity = availableQuantity();
        if (availableQuantity >= quantityToReserve) {
            this.reserved += quantityToReserve;
            return quantityToReserve;
        }

        throw new UnavailableStockException("The quantity you want to reserve is not available");
    }


    public int finalizeStock(int quantityToSell) {
        if (quantityToSell <= this.reserved) {
            this.quantityInStock -= quantityToSell;
            this.reserved -= quantityToSell;

            return quantityToSell;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", reserved=" + reserved +
                '}';
    }
}


