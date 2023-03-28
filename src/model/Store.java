package model;

import java.util.List;

public class Store {
    //Store классынын свойствалары: id, name, storeType(enum), location(локация), List<Ptoduct>products
    private int id;
    private  String name;
    private  StoreType storeType;
    private  String location;
     List<Product> products;

    public Store(int id, String name, StoreType storeType, String location, List<Product> products) {
        this.id = id;
        this.name = name;
        this.storeType = storeType;
        this.location = location;
        this.products = products;
    }
    public Store(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoreType getStoreType() {
        return storeType;
    }

    public void setStoreType(StoreType storeType) {
        this.storeType = storeType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", storeType=" + storeType +
                ", location='" + location + '\'' +
                ", products=" + products +
                '}';
    }
}
