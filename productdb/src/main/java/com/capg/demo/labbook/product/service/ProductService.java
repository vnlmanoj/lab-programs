package com.capg.demo.labbook.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.labbook.product.exception.ProductAlreadyExistsException;
import com.capg.demo.labbook.product.exception.ProductDoesnotExistException;
import com.capg.demo.labbook.product.model.Product;
import com.capg.demo.labbook.product.repo.ProductRepo;

@Service
public class ProductService {
@Autowired
ProductRepo repo;
public Product addProduct(Product product) throws ProductAlreadyExistsException
{
	boolean s=repo.existsById(product.getProdId());
	if(s)
	{
		throw new ProductAlreadyExistsException("Product already exists please enter valid id");
	}
			
	return repo.save(product);
}
public Product getProduct(int id) throws ProductDoesnotExistException
{
	if(repo.existsById(id))
	{
		return repo.getOne(id);	
	}
	else 
		throw new ProductDoesnotExistException("Product doesnot exist please enter a valid product detail to search");
	}

public List<Product> getAllProduct()
{
return repo.findAll();	
}
public boolean deleteProduct(int id)
{
if(repo.findById(id)==null)
{
return false;	
}
else
	repo.deleteById(id);
	return true;
}
public Product updateProduct(Product product) throws ProductDoesnotExistException
{
if(repo.existsById(product.getProdId()))
{
	Product prod=repo.getOne(product.getProdId());
	prod.setProdName(product.getProdName());
	prod.setProdPrice(product.getProdPrice());
	return prod;
}
else
{
	throw new ProductDoesnotExistException("Product doesnot exist cant update ");
	}
}
}