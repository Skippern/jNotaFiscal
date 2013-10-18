package enums;

public enum Currency {
	BRL("BRL", "Brazilian Real", "R$"),
	USD("USD", "US Dollar", "$"),
	EURO("EURO", "Euro", "€"),
	NOK("NOK", "Norwegian Crown", "Kr"),
	GBP("GBP", "British Pound", "₤");
	
	private String shortName;
	private String longName;
	private String unitName;
	
	private Currency(String shortN, String longN, String cur) {
		shortName = shortN;
		longName = longN;
		unitName = cur;
	}
	public String toString() {
		return longName + " (" + shortName + "/" + unitName + ")";
	}
	public String getShortName() {
		return shortName;
	}
	public String getLongName() {
		return longName;
	}
	public String getUnitName() {
		return unitName;
	}
}