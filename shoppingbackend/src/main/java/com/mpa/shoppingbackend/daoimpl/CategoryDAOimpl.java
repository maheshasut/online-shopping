package com.mpa.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mpa.shoppingbackend.dao.CategoryDAO;
import com.mpa.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();	
	
	static{
		
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDiscription("This is Television description");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		//adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDiscription("This is mobile description");
		category.setImageURL("CAT_2.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		//adding first category
		category.setId(3);
		category.setName("Refrigerator");
		category.setDiscription("This is Refrigerator description");
		category.setImageURL("CAT_3.png");
		category.setActive(true);
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//Enhanced For loop
		for(Category category : categories){
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
