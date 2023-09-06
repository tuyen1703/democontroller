package vn.edu.pxu.democontroller.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import vn.edu.pxu.democontroller.model.Product;

public interface ProductRepository {
	List<Product> fimAll();

	Product finByid(int id);

	void save(Product product);
}
