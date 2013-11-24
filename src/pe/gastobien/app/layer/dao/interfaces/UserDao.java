package pe.gastobien.app.layer.dao.interfaces;

import pe.gastobien.app.domain.User;

public interface UserDao extends Dao<User> {

	User getUserByLogin(String login);
	
	Boolean existUser(String login);
}
