package com.niit.DAO;


import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {
	

	public void addsupplier(Supplier Supplier);
	public List<Supplier> getSupList();
	public void deleteSupplierById(String supid);
	public Supplier getSupplierById(String supid);
	public void updatesupplier(Supplier supplier);
}
