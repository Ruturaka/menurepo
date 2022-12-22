package com.journaldev.model;

public class Menu {
    Integer id;
    String dish;
    Integer price;

    public Menu() {
    }

    public Menu(Integer id, String dish, Integer price){
        this.id=id;
        this.dish=dish;
        this.price=price;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuMapper{" +
                "id=" + id +
                ", dish='" + dish + '\'' +
                ", price=" + price +
                '}';
    }
}
