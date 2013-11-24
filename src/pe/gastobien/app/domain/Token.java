package pe.gastobien.app.domain;

import java.sql.Date;

public class Token {
	
    private Integer tokenID;
    
    private String tokenValue;
    
    private String status;
    
    private Boolean active;
    
    private Date creationDate;
    
    private Integer userID;

	public Integer getTokenID() {
		return tokenID;
	}

	public void setTokenID(Integer tokenID) {
		this.tokenID = tokenID;
	}

	public String getTokenValue() {
		return tokenValue;
	}

	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
}
