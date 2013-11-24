package pe.gastobien.app.layer.service.interfaces;

import java.util.List;
import pe.gastobien.app.domain.*;

public interface CategoryDetailService {
	
	public List<CategoryDetail> getCategoryDetailByCategoryId(int categoryId);
	
	public void AddCategoryDetail(CategoryDetail CategoryDetail);
	
	public void delete(CategoryDetail t);
}
