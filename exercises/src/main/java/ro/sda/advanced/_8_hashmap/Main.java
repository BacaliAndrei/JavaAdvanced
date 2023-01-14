package ro.sda.advanced._8_hashmap;

public class Main {

    public static void main(String[] args) {

        StockManager stockManager = new StockManager();

        stockManager.addStock(new StockItem("Milk" , 2.2 , 200));
        stockManager.addStock(new StockItem("Bacon" , 6 , 50));
        stockManager.addStock(new StockItem("Tomato" , 3 , 500));
        stockManager.addStock(new StockItem("Chicken" , 10 , 300));

        stockManager.addStock(new StockItem("Milk" , 2100 , 50));

        System.out.println("This quantity was reserved : " + stockManager.reserveStock("Tomato",100 ));

        stockManager.sellStock("Tomato", 100);

    }
}

