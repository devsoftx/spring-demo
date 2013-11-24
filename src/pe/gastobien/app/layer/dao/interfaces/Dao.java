package pe.gastobien.app.layer.dao.interfaces;

import java.util.List;

public interface Dao<T> {
	
	void save(T t);
	
	void update(T t);
	
	void delete(T t);
	
	T getById(T t);
	
	List<T> getAll(T t);
}
