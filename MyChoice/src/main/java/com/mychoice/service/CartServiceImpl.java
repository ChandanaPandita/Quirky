package com.mychoice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychoice.dao.CartItemDAO;
import com.mychoice.model.CartItem;
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartItemDAO cartItemDAO;
	public void addCart(CartItem cartItem) {
		
		cartItemDAO.addCart(cartItem);
	}
	
	

}
