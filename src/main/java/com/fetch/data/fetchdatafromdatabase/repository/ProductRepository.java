package com.fetch.data.fetchdatafromdatabase.repository;

import com.fetch.data.fetchdatafromdatabase.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {
}
