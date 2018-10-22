package com.vaidoos.roomcrud.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "CartModel")
public class CartModel {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private long ID;

    @ColumnInfo(name = "pCategorySubID")
    @SerializedName("pCategorySubID")
    @Expose
    private String pCategorySubID;

    @ColumnInfo(name = "ProductID")
    @SerializedName("ProductID")
    @Expose
    private String productID;

    @ColumnInfo(name = "ProductName")
    @SerializedName("ProductName")
    @Expose
    private String productName;

    @ColumnInfo(name = "pCode")
    @SerializedName("pCode")
    @Expose
    private String pCode;

    @ColumnInfo(name = "pPriceSales")
    @SerializedName("pPriceSales")
    @Expose
    private String pPriceSales;

    @ColumnInfo(name = "pPIC_Locate")
    @SerializedName("pPIC_Locate")
    @Expose
    private String pPICLocate;

    @ColumnInfo (name = "pQuantity")
    @SerializedName("pQuantity")
    @Expose
    private String pQuantity;

    /*
     * No args constructor for use in serialization
     */

    public CartModel() {
    }

    /*
     *
     * @param pCategorySubID
     * @param pPriceSales
     * @param pCode
     * @param pPICLocate
     * @param productName
     * @param productID
     * @param pQuantity
     */
    /*public CartModel(String pCategorySubID, String productID, String productName, String pCode, String pPriceSales, String pPICLocate, String pQuantity) {
        super();
        this.pCategorySubID = pCategorySubID;
        this.productID = productID;
        this.productName = productName;
        this.pCode = pCode;
        this.pPriceSales = pPriceSales;
        this.pPICLocate = pPICLocate;
        this.pQuantity = pQuantity;
    }*/

    public String getPCategorySubID() {
        return pCategorySubID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setPCategorySubID(String pCategorySubID) {
        this.pCategorySubID = pCategorySubID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    public String getPPriceSales() {
        return pPriceSales;
    }

    public void setPPriceSales(String pPriceSales) {
        this.pPriceSales = pPriceSales;
    }

    public String getPPICLocate() {
        return pPICLocate;
    }

    public void setPPICLocate(String pPICLocate) {
        this.pPICLocate = pPICLocate;
    }

    public String getPQuantity() {
        return pQuantity;
    }

    public void setPQuantity(String pQuantity) {
        this.pQuantity = pQuantity;
    }

    @Override
    public String toString() {
        return "CartModel{" +
                "ID=" + ID +
                ", pCategorySubID='" + pCategorySubID + '\'' +
                ", productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", pCode='" + pCode + '\'' +
                ", pPriceSales='" + pPriceSales + '\'' +
                ", pPICLocate='" + pPICLocate + '\'' +
                ", pQuantity='" + pQuantity + '\'' +
                '}';
    }
}