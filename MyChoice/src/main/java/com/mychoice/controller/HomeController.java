package com.mychoice.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mychoice.model.Item;
import com.mychoice.model.UserModel;
import com.mychoice.service.CategoryService;
import com.mychoice.service.ItemService;
import com.mychoice.service.UserService;

@Controller
public class HomeController {
	@Autowired
	ItemService itemservice;
	@Autowired
	UserService userservice;
	@Autowired
	CategoryService categoryservice;
//mapping i.e, to the home page
	@RequestMapping("/")
	public ModelAndView onHomeLoad(){
	System.out.println("home() method called");
	return new ModelAndView("home");
	}
	//navigates to the signup page
	/*@RequestMapping("/signUp")
	public ModelAndView signUp(){
		UserModel usermodel=new UserModel();
	System.out.println("signUp() method called");
	return new ModelAndView("signUp","user",usermodel);
	}*/
	@RequestMapping("/AsCustomer")
	public ModelAndView customerCheck (Principal principal) throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("Customer login");
		List<Item> items=itemservice.viewItems();
		ObjectMapper mapper=new ObjectMapper();
		String jsonData=mapper.writeValueAsString(items);
		return new ModelAndView("customerHome","listofproducts",jsonData);
	}
	@RequestMapping("/AsAdmin")
	public ModelAndView adminCheck (Principal principal)
	{
		System.out.println("in Admin");
		return new ModelAndView("adminHome");
	}
	@RequestMapping("/login")
	public String loginMethod()
	{
		System.out.println("Login Page");
		return "login";
	}
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
		System.out.println("logout page called");

		return "logout";
		
	}
	@RequestMapping("/contact")
	public String contactMethod()
	{
		System.out.println("contact details");
		return "contact";
	}
	@RequestMapping("/about")
	public String aboutMethod()
	{
		System.out.println("aboutus details");
		return "about";
	}
	
	//stores the values in the signup page
	/*@RequestMapping("/register")
	public ModelAndView register(@Valid@ModelAttribute("user")
	UserModel user,BindingResult bindingResult)
	{
		if(bindingResult.hasErrors()){
			return new ModelAndView("signUp");
		}
		
	System.out.println("USERNAME:"+user.getName());
	System.out.println("PASSWORD:"+user.getPassword());
	System.out.println("EMAIL-ID:"+user.getEmailid());
	userservice.addUserModel(user);
	System.out.println("Saved the details");
	return new ModelAndView("home");
	}*/
	@RequestMapping("/item")
	public ModelAndView item(@Valid@ModelAttribute("itemobj")
	Item item,BindingResult bindingResult)
	{
		if(bindingResult.hasErrors()){
			return new ModelAndView("item");
		}
		
		return new ModelAndView("signUp");
		}
	@RequestMapping("/productOverview")
	public ModelAndView productDetails(@RequestParam("id") String id)
	{
		Item item=itemservice.getItemById(Integer.parseInt(id));
		System.out.println("product details");
		return new ModelAndView("productOverview","item",item);
	}
	@RequestMapping("/Bags")
	public ModelAndView bagsdata(@RequestParam("category") String category) throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("category list");
		List<Item> listCategory=categoryservice.getItemByCategory(category);
		ObjectMapper mapper=new ObjectMapper();
		String itemJSON=mapper.writeValueAsString(listCategory);
		System.out.println("JSON data:"+itemJSON);
		return new ModelAndView("category","bags",itemJSON);
	}
}
	

