package pe.gastobien.app.layer.service.interfaces;

import java.util.List;
import pe.gastobien.app.domain.Category;

public interface CategoryService {
	
	public List<Category> getCategories(int userID, int year, int month);
	
	public void save(Category category);
	
	public void update(Category category);
	
	public void delete(int categoryId);
	
	public Category getCategoryById(int categoryId);
}
