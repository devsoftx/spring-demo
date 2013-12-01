package pe.gastobien.app.beans;

import java.io.Serializable;
import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gastobien.app.domain.Category;
import pe.gastobien.app.domain.CategoryDetail;
import pe.gastobien.app.layer.service.interfaces.CategoryDetailService;
import pe.gastobien.app.layer.service.interfaces.CategoryService;

@Component
public class HomeBean implements Serializable{
	
	private List<Category> categories;
	
	private List<CategoryDetail> details;
	
	private CategoryDetail detail;
	

	@Autowired
	private CategoryService service;
	
	@Autowired
	private CategoryDetailService detailService;
	
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init() {
		List<Category> categories = service.getCategories(1, 2013, 11);
		if(categories.size() > 0)
		{
			setCategories(categories);
			List<CategoryDetail> details = detailService.getCategoryDetailByCategoryId(1);
			setDetails(details);
		}		
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
	
	public CategoryDetail getDetail() {
		return detail;
	}

	public void setDetail(CategoryDetail detail) {
		this.detail = detail;
	}
}