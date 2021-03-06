package org.wecancodeit.shoppingcart;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToMany (mappedBy = "category")
	private Collection<Product> products;

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Collection<Product> getProducts() {
		return products;
	}
	
	protected Category() {
		
	}
	
	public Category(String name) {
		this.name = name;
	}
	
	

}
