package com.ecomm.template.ecommDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    ProductsRepo productsRepo;
    @Autowired
    public ProductsService(@Qualifier("repo") ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }

    public List<Products> getAllProducts()
    {
        return this.productsRepo.findAll();
    }

    public void addNewProduct(Products product) {
        this.productsRepo.save(product);
    }
    public void deleteProduct(long id){

        this.productsRepo.deleteById(id);
    }
    public void updateProduct(int id,Products product){
        List<Products> temp= this.productsRepo.findAll();
        this.productsRepo.deleteAll();
        temp.remove(id);
        temp.add(id,product);
        this.productsRepo.saveAll(temp);
    }
    public Products getProductByID(int id){
        int i = id-1;
        List<Products> n= this.productsRepo.findAll();
        Products temp = n.get(i);
        return temp;

    }
    public void deleteAllProducts(){
        productsRepo.deleteAll();
    }
}
