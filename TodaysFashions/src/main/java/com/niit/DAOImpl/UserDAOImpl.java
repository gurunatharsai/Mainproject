package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	public void adduser(User user) {
		// TODO Auto-generated method stub

		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.save(user);
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
	public List<User> getList() {
		// TODO Auto-generated method stub

		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		List<User> showuser=session.createQuery("from User").list();
		trans.commit();
		session.close();
		return showuser;
	}

	@Override
	public void deleteuser(String username) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		User user=(User)session.get(User.class, username); 
		session.delete(user);
		trans.commit();
		session.close();
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub

		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		User user=(User)session.get(User.class,id);
		trans.commit();
		session.flush();
		session.close();
		return user;
	}

	@Override
	public void editUser(User user) {
		// TODO Auto-generated method stub

		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction(); 
		session.update(user);
		trans.commit();
		session.flush();
		session.close();
		
	}

}
