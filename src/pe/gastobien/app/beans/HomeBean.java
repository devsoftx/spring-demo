package pe.gastobien.app.beans;

import java.io.Serializable;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gastobien.app.domain.Category;
import pe.gastobien.app.layer.service.interfaces.CategoryService;

@Component
public class HomeBean implements Serializable{	
	@Autowired
	private CategoryService service;
	
	private static final long serialVersionUID = 1L;
	
	private List<Category> categories;

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}	
}