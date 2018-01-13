package com.niit.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Repository

public class CategoryDAOImpl implements CategoryDAO {
@Autowired
	SessionFactory sessionFactory;

@Override
public void addcategory(Category category) {
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(category);
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}
}

@SuppressWarnings("unchecked")
@Override
public List<Category> getCatList() {
	// TODO Auto-generated method stub
	List<Category> catlist=new ArrayList<Category>();
	
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		catlist=session.createQuery("from Category").list();
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}
	return catlist;
	
}

@Override
public void deleteCategoryById(String catid) {
	// TODO Auto-generated method stub
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Category catobj=(Category)session.get(Category.class, catid);
		session.delete(catobj);
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}

	
}

@Override
public Category getCategoryById(String catid) {
	// TODO Auto-generated method stub

	Category catobj=new Category();
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		 catobj=(Category)session.get(Category.class, catid);
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}
	
	return catobj;
}

@Override
public void updatecategory(Category category) {
	// TODO Auto-generated method stub
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.update(category);
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}
	
	
}
	
}

