package pe.gastobien.app.domain;

import java.sql.Date;

public class Category {
    
    private Integer categoryID;
    
    private Integer userID;
    
    private String categoryName;
    
    private String categoryDescription;
    
    private Double categoryBudget;
    
    private Double spendCategory;
    
    private Integer yearBudget;
    
    private Integer monthBudget;
    
    private Date creationDate;
    
    private Boolean active;
    
    private Integer parentCategoryId;
    
    private Integer categoryType;
    
    private Double amountToShow;
    
    private Integer indexOf;
    
    public Integer getIndexOf() {
		return indexOf;
	}


	public void setIndexOf(Integer indexOf) {
		this.indexOf = indexOf;
	}


	public Integer getCategoryID() {
		return categoryID;
	}


	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}


	public Integer getUserID() {
		return userID;
	}


	public void setUserID(Integer userID) {
		this.userID = userID;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getCategoryDescription() {
		return categoryDescription;
	}


	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}


	public Double getCategoryBudget() {
		return categoryBudget;
	}


	public void setCategoryBudget(Double categoryBudget) {
		this.categoryBudget = categoryBudget;
	}


	public Double getSpendCategory() {
		return spendCategory;
	}


	public void setSpendCategory(Double spendCategory) {
		this.spendCategory = spendCategory;
	}


	public Integer getYearBudget() {
		return yearBudget;
	}


	public void setYearBudget(Integer yearBudget) {
		this.yearBudget = yearBudget;
	}


	public Integer getMonthBudget() {
		return monthBudget;
	}


	public void setMonthBudget(Integer monthBudget) {
		this.monthBudget = monthBudget;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Integer getParentCategoryId() {
		return parentCategoryId;
	}


	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}


	public Integer getCategoryType() {
		return categoryType;
	}


	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}


	public Double getAmountToShow() {
		return amountToShow;
	}


	public void setAmountToShow(Double amountToShow) {
		this.amountToShow = amountToShow;
	}

}
