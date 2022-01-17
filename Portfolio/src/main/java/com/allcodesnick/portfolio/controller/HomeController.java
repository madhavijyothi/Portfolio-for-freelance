package com.allcodesnick.portfolio.controller;

import com.allcodesnick.portfolio.model.Product;
import com.allcodesnick.portfolio.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    private ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome Home</h1>");
    }

    // Products /** permission

    @GetMapping("/list-products")
    public List<Product> getServicesProvidedList() {
        return productService.listProducts();
    }

    @GetMapping("/view-product/{id}")
    public Product viewProduct(@PathVariable long id){
        return productService.getProductsByID(id);
    }

    // Redirect Method to Login
    @GetMapping("/create-order-request")
    public ModelAndView createOrderRequest(){
        return new ModelAndView("redirect:/login");
    }
}
