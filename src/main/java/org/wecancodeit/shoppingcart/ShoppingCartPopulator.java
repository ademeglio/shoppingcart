package org.wecancodeit.shoppingcart;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartPopulator implements CommandLineRunner{

	@Resource
	private ProductRepository productRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private StatusRepository statusRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Category gadgets = categoryRepo.save(new Category("Gadgets"));
		Category nature = categoryRepo.save(new Category("Nature"));
		
		Product widget = productRepo.save(new Product("Widget", gadgets));
		Product stick = productRepo.save(new Product("Stick", nature));
		Product leaf = productRepo.save(new Product("Leaf", nature));

		Status wip = statusRepo.save(new Status("WIP"));
		Status processing = statusRepo.save(new Status("Processing"));
		Status invoice= statusRepo.save(new Status("Invoice"));
	}

}
