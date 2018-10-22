package com.vaidoos.roomcrud.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.vaidoos.roomcrud.model.CartModel;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    void insertCattItem(CartModel... cartModel);

    @Query("SELECT * from CartModel")
    LiveData<List<CartModel>> getAllCarts();

}
