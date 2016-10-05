package com.mychoice.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mychoice.model.CartItem;

@Repository
public class CartItemDAOImpl implements CartItemDAO{

	@Autowired
	SessionFactory sessionFactory;
	public void addCart(CartItem cartItem) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(cartItem);
		transaction.commit();
		
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	public List<CartItem> listCartItem(int id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from CartItem where cartId="+id);
		List<CartItem> list=(List<CartItem>)query.list();
		return list;
	}

}
