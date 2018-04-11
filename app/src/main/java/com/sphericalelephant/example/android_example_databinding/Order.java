package com.sphericalelephant.example.android_example_databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siyb on 11/04/18.
 */

public class Order extends BaseObservable {
	private String name;

	private List<Product> products = new ArrayList<>();

	@Bindable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Bindable
	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
		notifyPropertyChanged(BR.products);
	}

	public String productCount() {
		return String.valueOf(products.size());
	}
}
