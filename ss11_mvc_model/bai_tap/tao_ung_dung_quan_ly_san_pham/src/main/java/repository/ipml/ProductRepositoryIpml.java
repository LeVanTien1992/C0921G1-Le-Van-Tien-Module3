package repository.ipml;

import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryIpml implements ProductRepository {
    private static List<Product> productList;
    static {
        productList = new ArrayList<>();
//        int id, String name, String grand, double price
        productList.add(new Product(1,"Iphone 12 Pro Max","Apple", 1000));
        productList.add(new Product(2,"SamSung Galaxy S10","SamSung", 700));
        productList.add(new Product(3,"Nokia 1202","Nokia", 50));
        productList.add(new Product(4,"Tesla Model 5","Tesla", 2000));
        productList.add(new Product(5,"BlackBerry 9900","BlackBerry", 500));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product: productList) {
            if(id == product.getId()){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        productList.add(id, product);
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(id==productList.get(i).getId()){
                productList.remove(productList.get(i));
            }
        }
    }
}
