
public class Main {
    public static void main(String[] args) {
/*Онлайн магазин программасын тузунуз
2. 6 жаны пакет тузунуз - model, service, dao, enums
3. model пакетине класстарды тузунуз.
4. Класстар: Магазин(Store), Товар(Product), Город(City)
5. Store классынын свойствалары: id, name, storeType(enum), location(локация), List<Ptoduct>products
6. Product классынын свойствалары: id, name, brand(бренд), quantity(количество), price
7. City классынын свойствалары: id, name, List<Store>stores
8. service пакетине ар бир класска тиешелуу интерфейс тузуп, томонку методдорду жазыныз:
        1.  - StoreService:
- List<T> add(T t )
- T findById(Long id)
- String removeByBrand(String brand)
- List<T> filterByBrand(List<T> t) asc desc
- List<T> getAllTovar()
  2. - CityService:
//Шаардагы конкретный бренддин товарлары сатылган магазиндерди чыгаруу
- List<Store> getAllStoresByBrand(String brand)
//Бир шаардын ичиндеги тиби бир магазиндерди чыгаруу
- List<T> similarStoreTypes(Enum type, City city)
//Конкретный магазиндин ичинен товарлардын саны x ке берилген сандан жогору же андан кичине болгон товарларды осуу же кемуу тартибинде чыгаруу
- List<T> quantityTovar(int x, String asc desc)
9. Реализацияларын impl класстарда кылабыз
10. Методдорду озгортууго болбойт, условияда кандай берилсе ошол бойдон иштегиле!*/

    }
}


