package com.allcodesnick.portfolio.service;


import com.allcodesnick.portfolio.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> listProducts();

    Product getProductsByID(long id);

    void deleteProduct(long id);

    Product updateProduct(Product product, long id);
}
