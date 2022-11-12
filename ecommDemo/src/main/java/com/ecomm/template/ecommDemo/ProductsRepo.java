package com.ecomm.template.ecommDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repo")
public interface ProductsRepo extends JpaRepository<Products,Long> {
}
