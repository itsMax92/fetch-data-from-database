package com.fetch.data.fetchdatafromdatabase.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "user_id")
    private int UserId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "total")
    private int total;

    @Column(name = "trans_id")
    private String transactionId;

    @Column(name = "product_status")
    private String productStatus;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", UserId=" + UserId +
                ", productId=" + productId +
                ", total=" + total +
                ", transactionId='" + transactionId + '\'' +
                ", productStatus='" + productStatus + '\'' +
                '}';
    }
}
