package com.example.solid.dto;

public class Order {

    private Integer id;
    private String type;
    private Double amount;
    private Integer quantity;
    private String customerEmail;
    private String priority;

    
    public void setId(Integer id) {
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public Integer getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public Double getAmount() {
        return amount;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
}
