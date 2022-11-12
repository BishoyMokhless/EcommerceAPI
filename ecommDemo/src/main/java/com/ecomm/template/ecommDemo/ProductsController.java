package com.ecomm.template.ecommDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/ecommerce")
@RestController
public class ProductsController {
    ProductsService productsService;
    @Autowired

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }
    @GetMapping
    public List<Products> getAllProducts()
    {
        return this.productsService.getAllProducts();
    }
    @PostMapping
    public void add(@RequestBody Products product){
        productsService.addNewProduct(product);
    }
    @GetMapping(path = "{id}")
    public Products getById(@PathVariable("id") int id)
    {
        return productsService.getProductByID(id);
    }


    @DeleteMapping(path = "{id}")
    public void deleteById(@PathVariable("id") int id)
    {
        productsService.deleteProduct(id);
    }


    @PutMapping(path = "{id}")
    public void update(@PathVariable("id") int id, @RequestBody Products product){
        productsService.updateProduct(id,product);
    }
    @DeleteMapping
    public void deleteAllProducts(){
        productsService.deleteAllProducts();
    }

}
