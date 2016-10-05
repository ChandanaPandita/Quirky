package com.mychoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychoice.dao.CartDAO;
import com.mychoice.model.Cart;
@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartDAO cartDAO;
	public Cart getCartById(int id) {
		return cartDAO.getCartById(id);
		
	}

	public double totalAmount(int id) {
		return cartDAO.totalAmount(id);
	}

}
