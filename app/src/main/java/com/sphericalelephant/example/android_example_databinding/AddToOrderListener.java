package com.sphericalelephant.example.android_example_databinding;

import android.view.View;
import android.widget.EditText;

public class AddToOrderListener {

    public void addToOrder(Order o, Product p) {
        o.addProduct(p);
    }

    public void renameOrder(View v, Order o) {
        EditText et = v.getRootView().findViewById(R.id.et);
        o.setName(et.getText().toString());
    }
}
