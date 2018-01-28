package com.mpa.shoppingbackend.dao;

import java.util.List;

import com.mpa.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
