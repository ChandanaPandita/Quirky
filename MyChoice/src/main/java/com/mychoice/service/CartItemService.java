package com.mychoice.service;

import java.util.List;

import com.mychoice.model.CartItem;


public interface CartItemService {

	void addCart(CartItem cartItem); 
	
	List<CartItem> listCartItem(int id);
}
