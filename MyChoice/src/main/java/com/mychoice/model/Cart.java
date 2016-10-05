package com.mychoice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.codehaus.jackson.annotate.JsonIgnore;
@Entity
public class Cart {
	@Id@GeneratedValue
	private int cartId;
	private int TotalBill;
	@OneToOne
	@JoinColumn(name="id")
	@JsonIgnore
	private UserModel usermodel;
	
	@OneToMany(mappedBy="cart", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartItem> cartItems;
	public UserModel getUsermodel() {
		return usermodel;
	}
	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getTotalBill() {
		return TotalBill;
	}
	public void setTotalBill(int totalBill) {
		TotalBill = totalBill;
	}
}
