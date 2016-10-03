package com.mychoice.service;

import java.util.List;

import com.mychoice.model.Item;

public interface ItemService {
	void addItem(Item item);
	List<Item> viewItems ();
	void deleteItem(int id);
	Item getItemById(int id);
	void updateItem(Item item);
	

}
