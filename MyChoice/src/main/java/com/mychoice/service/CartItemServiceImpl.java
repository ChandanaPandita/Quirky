package com.mychoice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychoice.dao.CartItemDAO;
import com.mychoice.model.CartItem;
@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	CartItemDAO cartItemDAO;
	public void addCart(CartItem cartItem) {
		
		cartItemDAO.addCart(cartItem);
	}
	
	public List<CartItem> listCartItem(int id) {
		List<CartItem> list=cartItemDAO.listCartItem(id);
		return list;
	}
	
	

}
