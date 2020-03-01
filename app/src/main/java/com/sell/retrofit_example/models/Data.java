package com.sell.retrofit_example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("all_products_details")
    @Expose
    private AllProductsDetails allProductsDetails;

    public AllProductsDetails getAllProductsDetails() {
        return allProductsDetails;
    }

    public void setAllProductsDetails(AllProductsDetails allProductsDetails) {
        this.allProductsDetails = allProductsDetails;
    }
}
