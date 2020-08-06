package com.capg.demo.productresttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.productresttemplate.model.Product;


@RestController
public class ProductController {
@Autowired
RestTemplate rt;

@GetMapping("/get/prodId/{prodId}")
	public Product getProduct(@PathVariable int prodId)
	{
	Product product= rt.getForObject("http://localhost:8090/getProduct/id/"+prodId, Product.class);
	

	return product;
	}
@PostMapping("/add")
public Product add(@RequestBody Product product)
{
	Product  p=	rt.postForObject("http://localhost:8090/add", product, Product.class);	
	return p;
}
@DeleteMapping("/delete/prodId/{prodId}")
public boolean delete(@PathVariable int prodId)
{
	if(getProduct(prodId)!=null)
	{
rt.delete("http://localhost:8090/deleteProduct/id/"+prodId);
	return true;
	}
	else 
		return false;
	
}
@PutMapping("/update")
public Product update(@RequestBody Product product)
{
rt.put("http://localhost:8090/updateProduct", product);
return product;

}

}
