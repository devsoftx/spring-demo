package pe.gastobien.app.beans;

import java.io.Serializable;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gastobien.app.domain.Category;
import pe.gastobien.app.domain.CategoryDetail;
import pe.gastobien.app.layer.service.interfaces.CategoryService;

@Component
public class HomeBean implements Serializable{
	
	private List<Category> categories;
	
	private List<CategoryDetail> details;
	
	private CategoryDetail detail; 
	
	public CategoryDetail getDetail() {
		return detail;
	}

	public void setDetail(CategoryDetail detail) {
		this.detail = detail;
	}

	@Autowired
	private CategoryService service;
	
	private static final long serialVersionUID = 1L;
	
	public void init() {
		List<Category> categories = service.getCategories(1, 2013, 11);
		setCategories(categories);
	}	

	public List<CategoryDetail> getDetails() {
		return details;
	}

	public void setDetails(List<CategoryDetail> details) {
		this.details = details;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}	
}