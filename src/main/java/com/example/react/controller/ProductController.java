    package com.example.react.controller;

    import org.springframework.web.bind.annotation.*;
    import org.springframework.beans.factory.annotation.Autowired;
    import com.example.react.service.ProductService;
    import com.example.react.model.Vendor;
    import java.util.List;

    @RestController
    @RequestMapping("/products")
    public class ProductController {

        @Autowired
        private ProductService productService;

        @GetMapping
        public List<Vendor> getAllProducts() {
            return productService.getAllProducts();
        }

        @GetMapping("/{id}")
        public Vendor getProductById(@PathVariable Long id) {
            return productService.getProductById(id);
        }

        @PostMapping("/add")
        public void addProduct(@RequestBody Vendor product) {
            productService.addProduct(product);
        }

        @DeleteMapping("/{id}")
        public void deleteProduct(@PathVariable Long id) {
            productService.deleteProduct(id);
        }
    }