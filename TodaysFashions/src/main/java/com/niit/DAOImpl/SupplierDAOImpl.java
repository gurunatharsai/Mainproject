package com.niit.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.SupplierDAO;

import com.niit.model.Supplier;
@Repository
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addsupplier(Supplier Supplier) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.save(Supplier);
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
	public List<Supplier> getSupList() {
		// TODO Auto-generated method stub
		List<Supplier> suplist=new ArrayList<Supplier>();
		
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			suplist=session.createQuery("from Category").list();
			trans.commit();
			session.flush();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}
		return suplist;
	}

	@Override
	public void deleteSupplierById(String supid) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Supplier getSupplierById(String supid) {
		// TODO Auto-generated method stub
		Supplier supobj=new Supplier();
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			 supobj=(Supplier)session.get(Supplier.class,supid);
			trans.commit();
			session.flush();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}
		
		return supobj;
	}

	

	@Override
	public void updatesupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.update(supplier);
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


