package service.ipml;

import model.Product;
import repository.ProductRepository;
import repository.ipml.ProductRepositoryIpml;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryIpml();

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {

        return this.productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
       productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
       productRepository.remove(id);
    }
}
