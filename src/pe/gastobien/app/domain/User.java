package pe.gastobien.app.domain;

import java.sql.Date;

public class User {
	private int userID;
	
	private String login;
	
	private String password;
	
	private String email;
	
	private String alternativeEmail;
	
	private String secretQuestion;
	
	private String secretAnswer;
	
	private String idPhone;
	
	private String sessionKey;
	
	private String phone;
	
	private String userName;
	
	private String lastName;
	
	private Date userCreationDate;
	
	private int triesNumber;
	
	private Date lastUpdate;
	
	private String lastRemoteHost;
	
	private String userCurrency;
	
	private String language;
	
	private int currentMonth;
	
	private int currentYear;
	
	private int reportsPerMonth;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}
	public String getSecretQuestion() {
		return secretQuestion;
	}
	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}
	public String getSecretAnswer() {
		return secretAnswer;
	}
	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}
	public String getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(String idPhone) {
		this.idPhone = idPhone;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getUserCreationDate() {
		return userCreationDate;
	}
	public void setUserCreationDate(Date userCreationDate) {
		this.userCreationDate = userCreationDate;
	}
	public int getTriesNumber() {
		return triesNumber;
	}
	public void setTriesNumber(int triesNumber) {
		this.triesNumber = triesNumber;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLastRemoteHost() {
		return lastRemoteHost;
	}
	public void setLastRemoteHost(String lastRemoteHost) {
		this.lastRemoteHost = lastRemoteHost;
	}
	public String getUserCurrency() {
		return userCurrency;
	}
	public void setUserCurrency(String userCurrency) {
		this.userCurrency = userCurrency;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getCurrentMonth() {
		return currentMonth;
	}
	public void setCurrentMonth(int currentMonth) {
		this.currentMonth = currentMonth;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	public int getReportsPerMonth() {
		return reportsPerMonth;
	}
	public void setReportsPerMonth(int reportsPerMonth) {
		this.reportsPerMonth = reportsPerMonth;
	}
}
