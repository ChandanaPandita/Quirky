package com.mychoice.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mychoice.model.Item;
import com.mychoice.model.UserModel;
import com.mychoice.service.ItemService;
import com.mychoice.service.UserService;

@Controller
public class AdminController {
	@Autowired
	UserService service;

	@Autowired
	ItemService itemService;

	@RequestMapping("/viewCustomer")
	public ModelAndView viewCustomer() throws JsonGenerationException, JsonMappingException, IOException {
		List<UserModel> list=service.viewUsers();
		System.out.println("View list:" +list);
		ObjectMapper mapper = new ObjectMapper();
		String listJSON = mapper.writeValueAsString(list);
		return new ModelAndView("viewCustomer", "listofcustomers", listJSON);

	}

	@RequestMapping("/addItems")
	public ModelAndView addItem() {
		Item item = new Item();
		return new ModelAndView("item", "item", item);

	}

	@RequestMapping("/addProducts")
	public String item(@Valid@ModelAttribute("item") Item item, BindingResult bindingResult, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException
	{
	if(bindingResult.hasErrors())
	{
	return "redirect:/item";
	}
		System.out.println("Saved");
		itemService.addItem(item);
		MultipartFile itemImage = file;
		Path path = Paths.get("D://workspace//MyChoice//MyChoice//MyChoice//src//main//webapp//WEB-INF//resources//images//"+item.getid()+".jpg");
		
		if(itemImage !=null && !itemImage.isEmpty())
		{
			itemImage.transferTo(new File(path.toString()));
			
			System.out.println("image added");
			
		}
		System.out.println("i am in product page");
		
		return "redirect:/viewProducts";
		//return new ModelAndView("viewProducts");
	
	}
	@RequestMapping("/viewProducts")
	public ModelAndView viewProducts() throws JsonGenerationException, JsonMappingException, IOException {
		List<Item> item = itemService.viewItems();
		ObjectMapper mapper = new ObjectMapper();
		String jsonData = mapper.writeValueAsString(item);
		System.out.println("json data:"+jsonData);
		return new ModelAndView("viewProducts", "item",jsonData);

	}
	@RequestMapping("/updateProducts")
	public String updateProducts(@RequestParam("id") String id,@RequestParam("itemName") String itemName,@RequestParam("description") String description,@RequestParam("category") String category,@RequestParam("price") String price)
	{
		int Id=Integer.parseInt(id);
		Item item=itemService.getItemById(Id);
		item.setItemName(itemName);
		item.setDescription(description);
		item.setCategory(category);
		item.setPrice(Float.parseFloat(price));
		itemService.updateItem(item);
		return "redirect:/viewProducts";
	}
	@RequestMapping("/deleteProducts")
	public String deleteProducts(@RequestParam("id") String id)
		{
		System.out.println("deleted");
			itemService.deleteItem(Integer.parseInt(id));
			System.out.println(id);
			return "redirect:/viewProducts";
		}
	@RequestMapping("/editProducts")
		public ModelAndView editProducts(@RequestParam("id") int id)
		{
			System.out.println("Edit Item");
			Item item=itemService.getItemById(id);
			return new ModelAndView("editProducts","item",item);
			//return "redirect:/viewProducts";
			
		}
}
