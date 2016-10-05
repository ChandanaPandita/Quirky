package com.mychoice.controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mychoice.model.Cart;
import com.mychoice.model.CartItem;
import com.mychoice.model.Item;
import com.mychoice.model.UserModel;
import com.mychoice.service.CartItemService;
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
	CartItemService cartservice;
	@Autowired
	CartService cs;
	@RequestMapping("/addingtoCart")
	public String cart(@RequestParam("id") String id,@AuthenticationPrincipal User activeUser)
	{
		System.out.println("Cart part getting started");
		UserModel usermodel=userservice.getUserByName(activeUser.getUsername());
		System.out.println("user name="+usermodel);
		Cart cart=usermodel.getCart();
		Item item=itemService.getItemById(Integer.parseInt(id));
		System.out.println("item by id="+item);
		CartItem cartItem= new CartItem();
		cartItem.setCart(cart);
		cartItem.setItem(item);
		cartItem.setQuantity(1);
		cartItem.setCheckoutBill(item.getPrice());
		cartservice.addCart(cartItem);
		return "redirect:/AsCustomer";
	}
	@RequestMapping(value="/viewCart",method=RequestMethod.GET)
	public ModelAndView viewCart(@AuthenticationPrincipal User activeUser) throws JsonGenerationException, JsonMappingException, IOException{
		UserModel user=userservice.getUserByName(activeUser.getUsername());
		Cart cart=user.getCart();
		int cartId=cart.getCartId();
		List<CartItem> list=cartservice.listCartItem(cartId);
		ObjectMapper map=new ObjectMapper();
		String jsonData=map.writeValueAsString(list);
		double totalAmount=cs.totalAmount(cartId);
		ModelAndView model=new ModelAndView("cart");
		model.addObject("cartItem",jsonData);
		model.addObject("totalAmount",totalAmount);
		return model;
	}
}
