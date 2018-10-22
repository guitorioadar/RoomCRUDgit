package com.vaidoos.roomcrud;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vaidoos.roomcrud.model.CartModel;
import com.vaidoos.roomcrud.viewmodel.CartViewModel;

public class MainActivity extends AppCompatActivity {

    private CartViewModel cartViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartViewModel = ViewModelProviders.of(this).get(CartViewModel.class);

        CartModel cartModel = new CartModel();
        cartModel.setPCategorySubID("123");
        cartModel.setPQuantity("10");
        cartModel.setProductID("12");
        cartModel.setPPriceSales("45");

        cartViewModel.insertVM(cartModel);

    }
}
