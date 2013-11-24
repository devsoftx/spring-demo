package pe.gastobien.app.layer.service.interfaces;
import pe.gastobien.app.domain.User;

public interface UserService {
	
	public User getUserByLogin(String login);
	
	public Boolean existUser(String login);
	
	public Boolean Authenticate(String login, String password);
	
}