package service.impl;

import model.*;
import service.CityService;

import java.util.ArrayList;
import java.util.List;

public class CityServiceImpl implements CityService {
    List<Store>stores=new ArrayList<>();

    @Override
    public List<Store> getAllStoresByBrand(Brand brand) {
        List<Store>get=new ArrayList<>();
        for (Store store : stores) {
            for (Product prod: store.getProducts()) {
                if(prod.getBrand().equals(brand)){
                    get.addAll(stores);
                }
            }

        }
        return get;
    }

    @Override
    public List<Store> similarStoreTypes(StoreType type, City city) {
        List<Store>get=new ArrayList<>();
        for (Store store : city.getStores()) {
         if( store.getStoreType().equals(type))  {
             get.addAll(stores);
         }
        }
        return get;
    }

    @Override
    public List<Product> quantityTovar(int x, String ascDesc, String storeName) {
        List<Product>products=new ArrayList<>();
        for (Store store : stores) {
            if(store.getName().equals(storeName)){
            products.addAll(store.getProducts());
        }}
        List<Product>pr1;
        if(ascDesc.equalsIgnoreCase("asc")){
            pr1=products.stream().filter(p -> p.getQuantity()>x).toList();
        }
        else{
            pr1=products.stream().filter(p ->p.getQuantity()<x).toList();
        }
        return pr1;
    }
}
