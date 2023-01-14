package ro.sda.advanced._8_hashmap;

import java.util.HashMap;
import java.util.Map;

public class StockManager {

    Map<String, StockItem> itemMap;

    public StockManager() {
        this.itemMap = new HashMap<>();
    }

    public void addStock(StockItem item) {
        StockItem inStock = itemMap.get(item.getName());
        if (inStock != null) {
            inStock.adjustStock(item.availableQuantity());
        } else {
            itemMap.put(item.getName(), item);

        }
    }

    public int reserveStock(String itemName, int quantityToReserve) {
        StockItem inStock = itemMap.get(itemName);
        if (inStock != null && quantityToReserve > 0) {
            return inStock.reserveStock(quantityToReserve);

        }
        return 0;
    }

    public int sellStock(String itemName, int quantityToSell) {
        StockItem inStock = itemMap.get(itemName);
        if (inStock != null && quantityToSell > 0) {
            return inStock.finalizeStock(quantityToSell);

        }
        return 0;

    }
}
