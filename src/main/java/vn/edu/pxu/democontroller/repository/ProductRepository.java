package vn.edu.pxu.democontroller.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import vn.edu.pxu.democontroller.model.Product;

public interface ProductRepository {
	List<Product> findAll();

	Product finById(int code);

	void save(Product product);
	void update(Product product); 

	void delete(int code);
}

