package shoppingcart;

import javafx.beans.property.SimpleStringProperty;

/**
 * Shopping List Object.
 * Stores name and quantity of shoppingCart objects.
 * Heavily influenced by Person-class from javafx tutorial.
 * https://docs.oracle.com/javafx/2/ui_controls/table-view.htm
 *
 * @author Mikko Mustasaari
 * @version 2017.1214
 * @since 1.0
 */

public class ShoppingCartItem {

    /**
     * Stores item name
     */

    private final SimpleStringProperty itemName;

    /**
     * Stores item quantity
     */

    private final SimpleStringProperty itemQuantity;

    /**
     * Constructor for ShoppingCartItem
     * @param itemName itemName in string
     * @param itemQuantity itemQuantity in string
     */

    public ShoppingCartItem(String itemName, String itemQuantity) {
        this.itemName = new SimpleStringProperty(itemName);
        this.itemQuantity = new SimpleStringProperty(itemQuantity);
    }

    /**
     * Returns item name
     * @return returns item name
     */

    public String getItemName() {
        return itemName.get();
    }

    /**
     * Sets item name
     * @param fName Set item name
     */

    public void setItemName(String fName) {
        itemName.set(fName);
    }

    /**
     * Returns item quantity
     * @return return item quantity
     */

    public String getItemQuantity() {
        return itemQuantity.get();
    }

    /**
     * Set item quantity
     * @param qty set item quantity in string format
     */

    public void setItemQuantity(String qty) {
        itemQuantity.set(qty);
    }
}