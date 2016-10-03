package com.mychoice.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mychoice.model.Item;
import com.mychoice.model.UserModel;
@Repository
public class ItemDAOImpl implements ItemDAO {
@Autowired
	SessionFactory sessionFactory;
	
	public void addItem(Item item) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(item);
		transaction.commit();
		System.out.println("Details have been saved");
	}

	@SuppressWarnings("unchecked")
	public List<Item> viewItems() {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
				List<Item> list=session.createCriteria(Item.class).list();
		return list;
	}

	
	public void deleteItem(int Id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		
		Item item  = session.get(Item.class, new Integer(Id));
		session.delete(item);
		transaction.commit();
		System.out.println("Delete Item");
	}
	public Item getItemById(int Id) {
		System.out.println("Get item by ID");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("session:"+session);
		Transaction transaction=session.beginTransaction();
		//List<Item> list=session.createCriteria(Item.class).list();
		Item item=(Item)session.load(Item.class,new Integer(Id));
		System.out.println("Item:"+item.getItemName());
		transaction.commit();
		return item;
	}
	

	
	public void updateItem(Item item) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		//List<Item> list=session.createCriteria(Item.class).list();
		//Item item=session.get(Item.class, new Integer(Id));
		System.out.println(transaction);
		session.update(item);
		transaction.commit();
		System.out.println("updated");
		
	}
	
		
	
	}
