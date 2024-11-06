package classwork_40.ait.supermarket_arraylist.dao;

import classwork_40.ait.supermarket_arraylist.model.Product;

public interface Supermarket extends Iterable<Product> {

    boolean addProduct(Product product);
    Product removeProduct (long barCode);
    Product findByBarCode (long barCode);
    Iterable<Product> findByCategory(String category); //перебираемый потому что
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findByExpDate();
    int skuQuantity();


}
