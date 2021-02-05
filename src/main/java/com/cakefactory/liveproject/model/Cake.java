package com.cakefactory.liveproject.model;

import org.springframework.stereotype.Component;

@Component
public class Cake {
    private Long cakeId;
    private String cakeName;
    private Double price;


    public Cake(){}
    public Cake(Long cakeId, String cakeName, Double price) {
        this.cakeId = cakeId;
        this.cakeName = cakeName;
        this.price = price;
    }

    public Long getCakeId() {
        return cakeId;
    }

    public void setCakeId(Long cakeId) {
        this.cakeId = cakeId;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
