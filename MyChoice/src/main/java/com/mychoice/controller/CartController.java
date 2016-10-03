package com.mychoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mychoice.model.Cart;
import com.mychoice.model.CartItem;
import com.mychoice.model.Item;
import com.mychoice.model.UserModel;
import com.mychoice.service.CartService;
import com.mychoice.service.ItemService;
import com.mychoice.service.UserService;
@Controller
public class CartController {

	@Autowired
	ItemService itemService;
	@Autowired
	UserService userservice;
	@Autowired
	CartService cartservice;
	@RequestMapping("/addingtoCart")
	public String cart(@RequestParam("id") String id)
	{
		System.out.println("Cart part getting started");
		String loggedInUserName=SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel usermodel=userservice.getUserByName(loggedInUserName);
		System.out.println("user name="+usermodel);
		Cart cart=usermodel.getCart();
		Item item=itemService.getItemById(Integer.parseInt(id));
		System.out.println("item by id="+item);
		CartItem cartItem= new CartItem();
		cartItem.setItem(item);
		cartItem.setQuantity(1);
		cartItem.setCheckoutBill(item.getPrice());
		cartservice.addCart(cartItem);
		return "redirect:/viewProducts";
	}
}
