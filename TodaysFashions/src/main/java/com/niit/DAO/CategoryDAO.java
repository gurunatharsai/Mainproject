package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {


	public void addcategory(Category category);
	public List<Category> getCatList();
	public void deleteCategoryById(String catid);
	public Category getCategoryById(String catid);
	public void updatecategory(Category category);
}


