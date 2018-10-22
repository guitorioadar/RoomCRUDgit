package com.vaidoos.roomcrud.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.vaidoos.roomcrud.dao.MyDao;
import com.vaidoos.roomcrud.model.CartModel;

@Database(entities = {CartModel.class}, version = 1, exportSchema = false)
public abstract class MyAppDataBase extends RoomDatabase {

    public abstract MyDao myDao();

    private static MyAppDataBase instance;
    public static MyAppDataBase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    MyAppDataBase.class,
                    "room_crud")
                    .build();
        }
        return instance;
    }
}