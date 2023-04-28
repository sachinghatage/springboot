package com.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.entity.Product;
import com.crud.example.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//to save single product(save)
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	//to save list of products(save)
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	//to get list of products(fetch)
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	//to get product by id(fetch)
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	//to get product by name(fetch)
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product removed:"+id;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
