package model;

import java.util.List;

public class City {
    //City классынын свойствалары: id, name, List<Store>stores
    private int id;
    private String name;
    List<Store> stores;

    public City(int id, String name, List<Store> stores) {
        this.id = id;
        this.name = name;
        this.stores = stores;
    }

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

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
