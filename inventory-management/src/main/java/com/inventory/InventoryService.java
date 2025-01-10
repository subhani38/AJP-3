package com.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<Product> products;

    public InventoryService() {
        products = FileHandler.readProducts();
    }

    public void addProduct(Product product) {
        products.add(product);
        FileHandler.writeProducts(products);
    }

    public List<Product> viewProducts() {
        return new ArrayList<>(products);
    }

    public void updateProduct(String id, int quantity, double price) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setQuantity(quantity);
                product.setPrice(price);
                FileHandler.writeProducts(products);
                return;
            }
        }
    }

    public void deleteProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
        FileHandler.writeProducts(products);
    }
}
