package vn.edu.pxu.democontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.edu.pxu.democontroller.model.Product;
import vn.edu.pxu.democontroller.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product finById(int code) {
		// TODO Auto-generated method stub
		return this.productRepository.finById(code);
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		this.productRepository.save(product);
	}

	@Override
	public void update(Product product) {
		this.productRepository.save(product);
	}

	@Override
	public void delete(int code) {
		this.productRepository.delete(code);
	}

}

