package vn.edu.pxu.democontroller.service;

import java.util.List;

import org.springframework.stereotype.Component;

import vn.edu.pxu.democontroller.model.Product;

public interface ProductService {
	List<Product> findAll();
	Product finById(int id);
	void save(Product product);

	void update(Product product); 

	void delete(int code);
}
