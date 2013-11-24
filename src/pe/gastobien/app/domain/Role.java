package pe.gastobien.app.domain;

import java.sql.Date;

public class Role {
	
    private Integer RoleID;
    
    private String RoleName;
    
    private String RoleDescription;
    
    private Date CreationDate;
    
    private Boolean Active;

	public Integer getRoleID() {
		return RoleID;
	}

	public void setRoleID(Integer roleID) {
		RoleID = roleID;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	public String getRoleDescription() {
		return RoleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}
    
 }
