package pe.gastobien.app.domain;

import java.sql.Date;

public class CurrencyExchange {
	
	private String currencyFrom;
	
    private String currencyTo;
    
    private Date currencyDate;
    
    public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public Date getCurrencyDate() {
		return currencyDate;
	}

	public void setCurrencyDate(Date currencyDate) {
		this.currencyDate = currencyDate;
	}

	public double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(double currencyValue) {
		this.currencyValue = currencyValue;
	}

	private double currencyValue;

}
