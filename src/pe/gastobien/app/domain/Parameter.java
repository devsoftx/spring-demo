package pe.gastobien.app.domain;

import java.sql.Date;
import java.util.UUID;

public class Parameter {
	
    private Integer parameterID;
    
    private String parameterName;
    
    private String parameterDescription;
    
    private UUID valueGuid;
    
	private String valueString;
    
    private Boolean valueBoolean;
    
    private Date valueDateTime;
    
    private Boolean active;
    
    private Date creationDate;
    
    private Integer valueInteger;
    
    public Integer getParameterID() {
		return parameterID;
	}

	public void setParameterID(Integer parameterID) {
		this.parameterID = parameterID;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterDescription() {
		return parameterDescription;
	}

	public void setParameterDescription(String parameterDescription) {
		this.parameterDescription = parameterDescription;
	}

	public UUID getValueGuid() {
		return valueGuid;
	}

	public void setValueGuid(UUID valueGuid) {
		this.valueGuid = valueGuid;
	}

	public String getValueString() {
		return valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}

	public Boolean getValueBoolean() {
		return valueBoolean;
	}

	public void setValueBoolean(Boolean valueBoolean) {
		this.valueBoolean = valueBoolean;
	}

	public Date getValueDateTime() {
		return valueDateTime;
	}

	public void setValueDateTime(Date valueDateTime) {
		this.valueDateTime = valueDateTime;
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

	public Integer getValueInteger() {
		return valueInteger;
	}

	public void setValueInteger(Integer valueInteger) {
		this.valueInteger = valueInteger;
	}
}