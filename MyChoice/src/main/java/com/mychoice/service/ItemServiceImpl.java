package com.mychoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychoice.dao.ItemDAO;
import com.mychoice.model.Item;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemDAO itemDAO;
	public void addItem(Item item){
		itemDAO.addItem (item);
		
		
	}
	
	public List<Item> viewItems() {
		List<Item> list=itemDAO.viewItems();
		return list;
	}

	public void deleteItem(int id) {
		itemDAO.deleteItem(id);
		
	}

	@Override
	public Item getItemById(int id) {
			return itemDAO.getItemById(id);
		}
	

	@Override
	public void updateItem(Item item) {
		itemDAO.updateItem(item);
		
	}

	

}
