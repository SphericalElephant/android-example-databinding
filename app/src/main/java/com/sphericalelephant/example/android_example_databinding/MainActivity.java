package com.sphericalelephant.example.android_example_databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sphericalelephant.example.android_example_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		Product p = new Product();
		p.setName("Some Product");
		p.setDescription("Some Product Description.");
		p.setPrice(10.0f);

		Order o = new Order();
		o.setName("First Order!");

		binding.setAddToOrderListener(new AddToOrderListener());
		binding.setOrder(o);
		binding.setProduct(p);
	}
}
