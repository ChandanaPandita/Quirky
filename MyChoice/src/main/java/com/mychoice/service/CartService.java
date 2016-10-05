package com.mychoice.service;

import com.mychoice.model.Cart;

public interface CartService {

public Cart getCartById(int id);
	
public double totalAmount(int id);
}
