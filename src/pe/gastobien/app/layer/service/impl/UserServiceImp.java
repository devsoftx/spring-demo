package pe.gastobien.app.layer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gastobien.app.domain.User;
import pe.gastobien.app.layer.dao.interfaces.UserDao;
import pe.gastobien.app.layer.service.interfaces.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao dao;

	public User getUserByLogin(String login) {
		return dao.getUserByLogin(login);
	}

	public Boolean existUser(String login) {
		return dao.existUser(login);
	}

	public Boolean Authenticate(String login, String password) {
		User user = dao.getUserByLogin(login);
		if (user != null) {
			return user.getPassword().equals(password);
		}

		return false;
	}
}
