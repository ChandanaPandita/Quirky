package com.mychoice.dao;

import java.util.List;

import com.mychoice.model.CartItem;

public interface CartItemDAO {

	void addCart(CartItem cartItem); 
	
	List<CartItem> listCartItem(int id);
}
