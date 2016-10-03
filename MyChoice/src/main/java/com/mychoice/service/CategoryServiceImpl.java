package com.mychoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychoice.dao.CategoryDAO;
import com.mychoice.model.Item;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	
	@Autowired
	CategoryDAO categoryDAO;;
	
	@Override
	public List<Item> addView() {
		return null;
	}
	@Override
	public List<Item> getItemByCategory(String category) {
		
		return categoryDAO.getItemByCategory(category);
	}

}
