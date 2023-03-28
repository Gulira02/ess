package service.impl;

import model.Product;
import model.Store;
import service.StoreService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StoreServiceImpl implements StoreService {
   private List<Store>stores=new ArrayList<>();


    public StoreServiceImpl(List<Store> stores) {
        this.stores = stores;
    }

    @Override
    public List<Product> add(Product t) {
        List<Product>get=new ArrayList<>();
        for (Store store:stores) {
            store.getProducts().add(t);
            get.addAll(store.getProducts());
        }
        return get;
    }

    @Override
    public Store findById(Long id) {
        Store store1=new Store();
        for (Store store : stores) {
            if(store.getId()==id){
                store1=store;
            }
            else{
                System.out.println("Id jok"+id);
            }
        }
        
        return store1;
    }

    @Override
    public String removeByBrand(String brand) {
        for (Store store : stores) {
                for (Product product:store.getProducts()) {
                    if(product.getBrand().equals(brand)){
                        store.getProducts().remove(product);
                    }
                }
                }
        return "Successfully remove";
            }
            




    @Override
    public List<Product> getAllTovar() {
        List<Product>get=new ArrayList<>();
        for (Store store : stores) {
            get.addAll(store.getProducts());
        }
        return get ;
    }
    @Override
    public List<Product> filterByBrand(List<Product>ascDesc) {
        List<Product>products1=new ArrayList<>();
        for (Store store : stores) {
            products1.addAll(store.getProducts());
        }
        List<Product>pr;
        if(ascDesc.equals("asc")){
            pr=products1.stream().sorted(Comparator.comparing(Product::getBrand)).toList();
        }
      return products1;
        };
    }


