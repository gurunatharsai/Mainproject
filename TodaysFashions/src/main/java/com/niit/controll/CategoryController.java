package com.niit.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categorydao;
		
		@RequestMapping("/getCatPage")
		public ModelAndView getCatPage(@ModelAttribute("catobj") Category cat, Model model)
		{
			ModelAndView mv=new ModelAndView("CategoryPage");
			List<Category> catlist=categorydao.getCatList();
			System.out.println("-------------------------------->"+catlist);
			model.addAttribute("categorylist", catlist);
			return mv;
			
		}

		@RequestMapping("/addcategory")
		public ModelAndView addCategory(Category category, Model model,@ModelAttribute("catobj") Category cat)
		{
			categorydao.addcategory(category);
			ModelAndView mv=new ModelAndView("CategoryPage");
			List<Category> catlist=categorydao.getCatList();
			System.out.println("-------------------------------->"+catlist);
			model.addAttribute("categorylist", catlist);
			return mv;
		}

		@RequestMapping("/deleteCategory")
		public ModelAndView deleteCategory(@RequestParam("catid")String id,@ModelAttribute("catobj") Category cat,Model model)
		{
			categorydao.deleteCategoryById(id);
			ModelAndView mv=new ModelAndView("CategoryPage");
			List<Category> catlist=categorydao.getCatList();
			System.out.println("-------------------------------->"+catlist);
			model.addAttribute("categorylist", catlist);
			return mv;
			
		}
		
		
		@RequestMapping("/editCategory")
		public String getCatById(@RequestParam("catid")String id,Model model,@ModelAttribute("catobj") Category cat)
		{
		 Category category=categorydao.getCategoryById(id);
		 model.addAttribute(category);
		 return "EditCategoryPage";
		}
		
		@RequestMapping("/updatecategory")
		public ModelAndView updateCategory(Category category,@ModelAttribute("catobj") Category cat, Model model)
		{
			categorydao.updatecategory(category);
			ModelAndView mv=new ModelAndView("login");
			/*List<Category> catlist=categorydao.getCatList();
			System.out.println("-------------------------------->"+catlist);
			model.addAttribute("categorylist", catlist);
			*/return mv;
			
		}
	}