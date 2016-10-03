package com.mychoice.dao;

import java.util.List;

import com.mychoice.model.Item;

public interface ItemDAO {
	void addItem(Item item);
	List<Item> viewItems ();
	void deleteItem(int id);
	Item getItemById(int id);
	void updateItem(Item item);
	
	

}
