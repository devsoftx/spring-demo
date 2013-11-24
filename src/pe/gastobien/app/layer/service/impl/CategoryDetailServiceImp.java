package pe.gastobien.app.layer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gastobien.app.domain.CategoryDetail;
import pe.gastobien.app.layer.dao.interfaces.CategoryDetailDao;

@Service
public class CategoryDetailServiceImp {

	@Autowired
	private CategoryDetailDao dao;

	public List<CategoryDetail> getCategoryDetailByCategoryId(int categoryId) {
		return dao.getCategoryDetailByCategoryId(categoryId);
	}

	public void AddCategoryDetail(CategoryDetail CategoryDetail) {
		dao.save(CategoryDetail);
	}

	public void delete(CategoryDetail t) {
		dao.delete(t);
	}
}
