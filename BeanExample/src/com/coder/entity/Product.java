package com.coder.entity;

import java.io.Serializable;

public class Product implements Serializable {

    private int pid;

    private String pname;

    private float qty;



    private float price;

    //getters and //setters



    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public float getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
