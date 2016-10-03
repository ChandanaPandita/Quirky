package com.mychoice.dao;

import java.util.List;

import com.mychoice.model.Item;

public interface CategoryDAO {
	List<Item> addView(Item item);
	List<Item> getItemByCategory(String category);

}
