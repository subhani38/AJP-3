package com.inventory;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String category;
    private int quantity;
    private double price;

    public Product(String id, String name, String category, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + category + "," + quantity + "," + price;
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQuantity(int quantity2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(double price2) {
		// TODO Auto-generated method stub
		
	}
}
