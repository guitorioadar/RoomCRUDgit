package com.vaidoos.roomcrud.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.vaidoos.roomcrud.CartRepository;
import com.vaidoos.roomcrud.model.CartModel;

import java.util.List;

public class CartViewModel extends AndroidViewModel {

    private CartRepository mCartRepository;
    private LiveData<List<CartModel>> mAllCarts;


    public CartViewModel(@NonNull Application application) {
        super(application);
        mCartRepository = new CartRepository(application);
        mAllCarts = mCartRepository.getAllCartItems();
    }


    LiveData<List<CartModel>> getAllCartsVM() {
        return mAllCarts;
    }

    public void insertVM(CartModel cartModel) {
        mCartRepository.insertCartItem(cartModel);
    }
}
