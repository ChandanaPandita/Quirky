package com.mychoice.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mychoice.model.Cart;
import com.mychoice.model.UserModel;
import com.mychoice.model.UserRole;
@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
	SessionFactory sessionFactory;
    //saving the entry of the customer details
    public UserModel initFlow(){
    	return new UserModel();
    }
	public String addUserModel(UserModel user){
		String status="success";
		if(user.getName().isEmpty()){
			status="failure";
		}
		if(user.getPassword().isEmpty()){
			status="failure";
		}
		if(user.getEmailid().isEmpty()){
			status="failure";
		}
		System.out.println("Add User");
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		user.setEnabled(true);
		session.save(user);
		UserRole userRole=new UserRole();
		userRole.setAuthority("ROLE_USER");
		userRole.setUserId(user.getId());
		session.save(userRole);
		Cart cart=new Cart();
		user.setCart(cart);
		cart.setUsermodel(user);
		session.save(cart);
		transaction.commit();
		System.out.println("Details have been saved");
		return status;
	}
	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public List<UserModel> viewUsers() {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<UserModel> list=session.createCriteria(UserModel.class).list();
		return list;
	}
	
	
	public UserModel getUserByName(String name) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from UserModel where name=?");
		query.setString(0, name);
		UserModel userModel=(UserModel) query.uniqueResult();
		transaction.commit();
		return userModel;
	}
		
}
