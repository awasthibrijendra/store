package com.brij.store;
import com.brij.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @Autowired
    ProductService productService;

    @GetMapping("/index")
    public String index() {
        return "Hello IO am up";
    }

    @GetMapping("/productserviceurl")
    public String productserviceurl() {
        return productService.getProductUrl();
    }
}
