package service;
import model.*;

import java.util.List;
public interface CityService
{
    //Шаардагы конкретный бренддин товарлары сатылган магазиндерди чыгаруу
 List<Store> getAllStoresByBrand(Brand brand);
//Бир шаардын ичиндеги тиби бир магазиндерди чыгаруу
 List<Store> similarStoreTypes(StoreType type, City city);
//Конкретный магазиндин ичинен товарлардын саны x ке берилген сандан жогору же андан кичин
// е болгон товарларды осуу же кемуу тартибинде чыгаруу
 List<Product> quantityTovar(int x, String ascDesc,String storeName);
}
