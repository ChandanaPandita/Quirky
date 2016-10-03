package com.mychoice.service;

import java.util.List;

import com.mychoice.model.Item;

public interface CategoryService {
	List<Item> addView();
	List<Item> getItemByCategory(String category);

}
