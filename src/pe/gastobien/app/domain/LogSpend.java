package pe.gastobien.app.domain;

import java.sql.Date;
import java.util.UUID;

public class LogSpend {	
	
    private Integer logGastoId;
    
    private Integer subCategoryId;
    
	private Double spend;
    
    private String logDescription;
    
    private Date updateDate;
    
    private Integer typeOfPaying;
    
    private Integer userCurrency;
    
    private UUID  logKey;
    
    public Integer getLogGastoId() {
		return logGastoId;
	}


	public void setLogGastoId(Integer logGastoId) {
		this.logGastoId = logGastoId;
	}


	public Integer getSubCategoryId() {
		return subCategoryId;
	}


	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}


	public Double getSpend() {
		return spend;
	}


	public void setSpend(Double spend) {
		this.spend = spend;
	}


	public String getLogDescription() {
		return logDescription;
	}


	public void setLogDescription(String logDescription) {
		this.logDescription = logDescription;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public Integer getTypeOfPaying() {
		return typeOfPaying;
	}


	public void setTypeOfPaying(Integer typeOfPaying) {
		this.typeOfPaying = typeOfPaying;
	}


	public Integer getUserCurrency() {
		return userCurrency;
	}


	public void setUserCurrency(Integer userCurrency) {
		this.userCurrency = userCurrency;
	}


	public UUID getLogKey() {
		return logKey;
	}


	public void setLogKey(UUID logKey) {
		this.logKey = logKey;
	}

}
