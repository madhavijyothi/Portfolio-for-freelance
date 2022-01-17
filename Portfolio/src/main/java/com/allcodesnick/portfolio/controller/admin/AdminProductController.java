package com.allcodesnick.portfolio.controller.admin;

import com.allcodesnick.portfolio.model.Product;
import com.allcodesnick.portfolio.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/admin/product")
public class AdminProductController {

    private ProductService productService;

    public AdminProductController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/list-all")
    public List<Product> getServicesProvidedList(){
        return productService.listProducts();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable long id){
        productService.deleteProduct(id);
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable long id){
        return productService.updateProduct(product, id);
    }

    @GetMapping("/view/{id}")
    public Product viewProduct(@PathVariable long id){
        return productService.getProductsByID(id);
    }

}
