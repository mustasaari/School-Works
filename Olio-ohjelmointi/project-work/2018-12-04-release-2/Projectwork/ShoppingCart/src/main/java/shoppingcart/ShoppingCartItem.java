package shoppingcart;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 */

public class ShoppingCartItem {

    private final SimpleStringProperty itemName;
    private final SimpleStringProperty itemQuantity;

    public ShoppingCartItem(String itemName, String itemQuantity) {
        this.itemName = new SimpleStringProperty(itemName);
        this.itemQuantity = new SimpleStringProperty(itemQuantity);
    }

    public String getItemName() {
        return itemName.get();
    }
    public void setItemName(String fName) {
        itemName.set(fName);
    }

    public String getItemQuantity() {
        return itemQuantity.get();
    }
    public void setItemQuantity(String fName) {
        itemQuantity.set(fName);
    }
}