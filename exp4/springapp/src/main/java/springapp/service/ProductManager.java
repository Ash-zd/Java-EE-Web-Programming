package springapp.service;

import springapp.domain.Product;

import java.util.List;

public interface ProductManager  {
    void increasePrice(int percentage);
    List<Product> getProducts();
}
