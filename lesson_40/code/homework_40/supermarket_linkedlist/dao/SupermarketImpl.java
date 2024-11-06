package homework_40.supermarket_linkedlist.dao;

import homework_40.supermarket_linkedlist.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket {

    private Collection<Product> products = new LinkedList<>();

    @Override
    public boolean addProduct(Product product) {
        if (product == null){
            return false;
        }
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        Product product = findByBarCode(barCode);
        products.remove(product);
        return product;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product p : products){ //сравниваем п баркод с тем который прислала
            if (p.getBarCode() == barCode) { //сравнваем потому что примитив лонг и потмоу что числа простые, тип одинаковый
             return p;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(product -> product.getCategory().equalsIgnoreCase(category));
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
    }

    @Override
    public Iterable<Product> findByExpDate() {
        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    private Iterable<Product> findByPredicate(Predicate<Product> predicate){
        List<Product> res = new LinkedList<>();
        for (Product p : products){
            if (predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }
}
