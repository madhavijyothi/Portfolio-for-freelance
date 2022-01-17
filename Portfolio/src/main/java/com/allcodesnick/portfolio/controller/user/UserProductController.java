package com.allcodesnick.portfolio.controller.user;

import com.allcodesnick.portfolio.model.Product;
import com.allcodesnick.portfolio.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/product")
public class UserProductController {

    private ProductService productService;

    public UserProductController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/list-all")
    public List<Product> getServicesProvidedList() {
        return productService.listProducts();
    }

    @GetMapping("/view/{id}")
    public Product viewProduct(@PathVariable long id){
        return productService.getProductsByID(id);
    }
}
