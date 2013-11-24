package pe.gastobien.app.domain;

public class CategoryDetail {
	
    private int categoryID;
    
    private int detalleCategoriaId;
    
    private String categoryNameDetail;
    
    private String categoryDescriptionDetail;    
    
    private Double budgetDetail;
    
    private Double spendDetail;
    
    private Integer yearDetail;
    
    private Integer monthDetail;
    
    private Boolean active;
    
    private Double amountToShow;

    
    public int getCategoryID() {
		return categoryID;
	}


	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}


	public int getDetalleCategoriaId() {
		return detalleCategoriaId;
	}


	public void setDetalleCategoriaId(int detalleCategoriaId) {
		this.detalleCategoriaId = detalleCategoriaId;
	}


	public String getCategoryNameDetail() {
		return categoryNameDetail;
	}


	public void setCategoryNameDetail(String categoryNameDetail) {
		this.categoryNameDetail = categoryNameDetail;
	}


	public String getCategoryDescriptionDetail() {
		return categoryDescriptionDetail;
	}


	public void setCategoryDescriptionDetail(String categoryDescriptionDetail) {
		this.categoryDescriptionDetail = categoryDescriptionDetail;
	}


	public Double getBudgetDetail() {
		return budgetDetail;
	}


	public void setBudgetDetail(Double budgetDetail) {
		this.budgetDetail = budgetDetail;
	}


	public Double getSpendDetail() {
		return spendDetail;
	}


	public void setSpendDetail(Double spendDetail) {
		this.spendDetail = spendDetail;
	}


	public Integer getYearDetail() {
		return yearDetail;
	}


	public void setYearDetail(Integer yearDetail) {
		this.yearDetail = yearDetail;
	}


	public Integer getMonthDetail() {
		return monthDetail;
	}


	public void setMonthDetail(Integer monthDetail) {
		this.monthDetail = monthDetail;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Double getAmountToShow() {
		return amountToShow;
	}


	public void setAmountToShow(Double amountToShow) {
		this.amountToShow = amountToShow;
	}


	

}
