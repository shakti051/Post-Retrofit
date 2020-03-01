
package com.sell.retrofit_example.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllProductsDetails {

    @SerializedName("min_price")
    @Expose
    private Integer minPrice;
    @SerializedName("max_price")
    @Expose
    private Integer maxPrice;
    @SerializedName("selected_colors")
    @Expose
    private List<Object> selectedColors = null;
    @SerializedName("selected_sizes")
    @Expose
    private List<Object> selectedSizes = null;
    @SerializedName("selected_colors_hf")
    @Expose
    private String selectedColorsHf;
    @SerializedName("selected_sizes_hf")
    @Expose
    private String selectedSizesHf;
    @SerializedName("sort_by")
    @Expose
    private String sortBy;
    @SerializedName("products")
    @Expose
    private Products products;
    @SerializedName("breadcrumb_html")
    @Expose
    private String breadcrumbHtml;
    @SerializedName("selected_cat")
    @Expose
    private List<String> selectedCat = null;
    @SerializedName("parent_id")
    @Expose
    private String parentId;
    @SerializedName("parent_slug")
    @Expose
    private String parentSlug;

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public List<Object> getSelectedColors() {
        return selectedColors;
    }

    public void setSelectedColors(List<Object> selectedColors) {
        this.selectedColors = selectedColors;
    }

    public List<Object> getSelectedSizes() {
        return selectedSizes;
    }

    public void setSelectedSizes(List<Object> selectedSizes) {
        this.selectedSizes = selectedSizes;
    }

    public String getSelectedColorsHf() {
        return selectedColorsHf;
    }

    public void setSelectedColorsHf(String selectedColorsHf) {
        this.selectedColorsHf = selectedColorsHf;
    }

    public String getSelectedSizesHf() {
        return selectedSizesHf;
    }

    public void setSelectedSizesHf(String selectedSizesHf) {
        this.selectedSizesHf = selectedSizesHf;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public String getBreadcrumbHtml() {
        return breadcrumbHtml;
    }

    public void setBreadcrumbHtml(String breadcrumbHtml) {
        this.breadcrumbHtml = breadcrumbHtml;
    }

    public List<String> getSelectedCat() {
        return selectedCat;
    }

    public void setSelectedCat(List<String> selectedCat) {
        this.selectedCat = selectedCat;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentSlug() {
        return parentSlug;
    }

    public void setParentSlug(String parentSlug) {
        this.parentSlug = parentSlug;
    }

}
