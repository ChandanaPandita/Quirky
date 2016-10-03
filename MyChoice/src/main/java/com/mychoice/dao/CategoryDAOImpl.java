package com.mychoice.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mychoice.model.Item;
@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Item> addView(Item item) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<Item>list=session.createCriteria(Item.class).list();
		transaction.commit();
		return list;
	}

	@Override
	public List<Item> getItemByCategory(String category) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<Item>list=session.createCriteria(Item.class).add(Restrictions.like("category", category)).list();
		return list;
	}

	

	



	
	
	

}
