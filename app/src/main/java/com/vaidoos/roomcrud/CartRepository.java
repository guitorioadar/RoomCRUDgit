package com.vaidoos.roomcrud;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.vaidoos.roomcrud.dao.MyDao;
import com.vaidoos.roomcrud.database.MyAppDataBase;
import com.vaidoos.roomcrud.model.CartModel;

import java.util.List;

public class CartRepository {

    private MyDao myDao;
    private LiveData<List<CartModel>> mAllCarts;

    public CartRepository(Application application){
        MyAppDataBase myAppDataBase = MyAppDataBase.getAppDatabase(application);
        myDao = myAppDataBase.myDao();
        mAllCarts = myDao.getAllCarts();
    }

    public LiveData<List<CartModel>> getAllCartItems(){
        return mAllCarts;
    }

    public void insertCartItem(CartModel cartModel){
        //new insertAsynkTast(myDao).mAsyncMyDao.insertCattItem(cartModel);
        new insertAsynkTast(myDao).execute(cartModel);
    }

    private static class insertAsynkTast extends AsyncTask<CartModel,Void,Void>{

        private MyDao mAsyncMyDao;

        public insertAsynkTast(MyDao myDao) {
            mAsyncMyDao = myDao;
        }

        @Override
        protected Void doInBackground(CartModel... cartModels) {
            mAsyncMyDao.insertCattItem(cartModels[0]);
            return null;
        }
    }

}
