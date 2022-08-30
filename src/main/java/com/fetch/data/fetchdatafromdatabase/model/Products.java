package com.fetch.data.fetchdatafromdatabase.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_category")
    private int productCategory;

    @Column(name = "product_brand")
    private int brand;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_price")
    private int price;

    @Column(name = "product_qty")
    private int productQuantity;

    @Column(name = "product_desc")
    private String productDescription;

    @Column(name = "product_image")
    private String productImage;

    @Column(name = "product_keywords")
    private String productKeywords;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductKeywords() {
        return productKeywords;
    }

    public void setProductKeywords(String productKeywords) {
        this.productKeywords = productKeywords;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productCategory=" + productCategory +
                ", brand=" + brand +
                ", productTitle='" + productTitle + '\'' +
                ", price=" + price +
                ", productQuantity=" + productQuantity +
                ", productDescription='" + productDescription + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productKeywords='" + productKeywords + '\'' +
                '}';
    }
}
