package com.edureka.javasql2.webservices.products;

import java.util.ArrayList;

public class ProductsLister {

	public String listProducts(String category) {
		
		ArrayList<String> products = new ArrayList<>();
		
		if (category.equals("Electronics")) {
			
			products.add("Immortal IM1000D Dual Channel Wired On Ear Gaming Headphones");
			products.add("Razer DeathAdder Essential Wired Gaming Mouse");
		}else if (category.equals("Fashion")) {
			
			products.add("Campus Men's OXYFIT (N) Walking Shoe");
			products.add("eKools Women's Winterwear Woolen Self");
			products.add("Amazon Brand - Inkast Denim Co. Men's Lightweight Jacket");
		}else if (category.equals("Books")) {
			
			products.add("Vahana: Vehicles of the Gods");
		}
		
		return products.toString();
	}
	
	public static void main(String[] args) {
		
		ProductsLister lister = new ProductsLister();
		String products = lister.listProducts("Fashion");
		
		System.out.println(products);
	}
}
