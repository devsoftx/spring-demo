package pe.gastobien.app.layer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gastobien.app.domain.Category;
import pe.gastobien.app.layer.dao.interfaces.CategoryDao;
import pe.gastobien.app.layer.service.interfaces.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
	private CategoryDao dao;

	public List<Category> getCategories(int userID, int year, int month) {
		return dao.getCategories(userID, year, month);
	}

	public void save(Category category) {
		dao.save(category);
	}

	public void update(Category category) {
		dao.update(category);
	}

	public void delete(int categoryId) {
		Category entity = new Category();
		entity.setCategoryID(categoryId);
		dao.delete(entity);
	}

	public Category getCategoryById(int categoryId) {
		Category entity = new Category();
		entity.setCategoryID(categoryId);
		return dao.getById(entity);
	}
}
