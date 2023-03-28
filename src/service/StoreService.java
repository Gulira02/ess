package service;

import model.Product;
import model.Store;

import java.util.List;

public interface StoreService {
    List<Product> add(Product t );
 Store findById(Long id);
 String removeByBrand(String brand);
 List<Product> filterByBrand(List<Product> ascDesc) ;//asc desc
 List<Product> getAllTovar();


}
