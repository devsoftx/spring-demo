package pe.gastobien.app.layer.dao.interfaces;

import java.util.List;

import pe.gastobien.app.domain.Category;

public interface CategoryDao extends Dao<Category>{

	List<Category> getCategories(int userID, int year, int month);

}
