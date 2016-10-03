package com.mychoice.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CartItem {
	@Id@GeneratedValue
	private int cartItemid;
	private int quantity;
	@OneToOne
	@JoinColumn(name="id")
	private Item item;
	private double CheckoutBill;
	@ManyToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public int getCartItemid() {
		return cartItemid;
	}
	public void setCartItemid(int cartItemid) {
		this.cartItemid = cartItemid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getCheckoutBill() {
		return CheckoutBill;
	}
	public void setCheckoutBill(double checkoutBill) {
		CheckoutBill = checkoutBill;
	}
	
}
