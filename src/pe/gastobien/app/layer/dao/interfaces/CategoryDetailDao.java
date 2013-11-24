package pe.gastobien.app.layer.dao.interfaces;

import java.util.List;

import pe.gastobien.app.domain.CategoryDetail;

public interface CategoryDetailDao extends Dao<CategoryDetail> {

	List<CategoryDetail> getCategoryDetailByCategoryId(int categoryId);

	void save(CategoryDetail t);

	void delete(CategoryDetail t);

}
