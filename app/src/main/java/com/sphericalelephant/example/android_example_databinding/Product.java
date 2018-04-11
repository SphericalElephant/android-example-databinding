package com.sphericalelephant.example.android_example_databinding;

/**
 * Created by siyb on 11/04/18.
 */

public class Product {
	private String name;
	private String description;
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayPrice() {
		return String.valueOf(price);
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
