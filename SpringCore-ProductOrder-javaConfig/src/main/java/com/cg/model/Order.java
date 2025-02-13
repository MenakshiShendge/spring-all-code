package com.cg.model;

public class Order {

	private Product product;
	private int quantity;
	public Order() {
		super();
	}

	public Product getProduct() {
		return product;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void showOrderdetails() {
		System.out.println("Product name : "+this.product.getName());
		System.out.println("product price : "+this.product.getPrice());
		System.out.println("product quntity : "+this.quantity);
		System.out.println("Total price : "+(this.product.getPrice()*this.quantity));
	}
	
	
}
