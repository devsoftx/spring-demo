package pe.gastobien.app.beans;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.gastobien.app.domain.Category;
import pe.gastobien.app.domain.User;
import pe.gastobien.app.layer.service.interfaces.CategoryService;
import pe.gastobien.app.layer.service.interfaces.UserService;

@Component
public class LoginBean implements Serializable{
	
	@Autowired
	private UserService service;
	
	@Autowired
	private CategoryService categoryService;
	
	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}
	
	public String doAuthenticate() {
		String destino = "";
		try {
			service.Authenticate(userName, password);
			User user = service.getUserByLogin(userName);
			HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
			List<Category> categories = categoryService.getCategories(user.getUserID(), 2013, 11);
			request.setAttribute("categories", categories);
			destino = "main";
		} catch (Exception e) {
			FacesMessage msg = new FacesMessage(String.format("Error: %s", e.getMessage()));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			destino = "login";
		}
		return destino;
	}
}
