package Question3;

import java.util.ArrayList;
import java.util.List;
import Question3.Item;

public class ShippingOrder {
    private double shippingCost;
    private double weight;
    private String address;
    private ArrayList<Item> items;

    public ShippingOrder(List<Item> initialItems, String address) {
        this.shippingCost = 0;
        this.weight = 0;
        this.address = address;

        this.addItems(initialItems);

        // Call other functions to update logs, remote analytics, etc.
    }

    public void addItems(List<Item> items) {
        this.items.addAll(items);
        for(Item item : items) {
            weight += calculateWeight(item);
        }

        updateShippingCost();
    }

    private void updateShippingCost() {
        this.shippingCost = fetchShippingRate(this.address) * getTotalWeight();
    }

    public double calculateWeight(Item item) {
        // calculate weight of the item
    }

    public double getTotalWeight() {
        return weight;
    }

    public double fetchShippingRate(String address) {
        // Get the Shipping Rate
    }

    // other Methods
}
