package com.example.session01_md03;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> productList = new ArrayList<>();
    public ProductService() {
        Product product1 = new Product("SP001", "San Pham A", 2000);
        Product product2 = new Product("SP002", "San Pham B", 4000);
        Product product3 = new Product("SP003", "San Pham C", 8000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product updateProduct(Product product, String id) {
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return p;
            }
        }
        return null;
    }

    public void deleteProduct(String id) {
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                productList.remove(p);
            }
        }
    }

}
