package web03;

public class Mock2VO {
	private String id;
	private String currencyCode;
	private String currency;
	private String money;
	private String personalColor;
	private String language;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getPersonalColor() {
		return personalColor;
	}
	public void setPersonalColor(String personalColor) {
		this.personalColor = personalColor;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Mock2VO [id=" + id + ", currencyCode=" + currencyCode + ", currency=" + currency + ", money=" + money
				+ ", personalColor=" + personalColor + ", language=" + language + "]";
	}
	
	
}
