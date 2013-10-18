package dbObjects;

import core.Currency;

public class InvoiceDetail {
	private int idID;
	private Invoice idInvoice;
	private int idItemNr;
//	private Service idService;
//	private Product idProduct;
	private TimeSheet idTimesheet;
	private TravelExpenses idTravelExpense;
//	private Delivery idDelivery;
	private String idDescription;
	private String idUnit;
	private Currency idUnitPrice;
	private double idQuantity;
	private double idDiscount;
	
	public InvoiceDetail(Invoice i) {
		idID = 0;
		idInvoice = i;
	}
	
	public int getID() {
		return idID;
	}
	public Invoice getInvoice() {
		return idInvoice;
	}
	public void setTravelExpenses(TravelExpenses t) {
		idTravelExpense = t;
	}
	public TravelExpenses getTravelExpenses() {
		return idTravelExpense;
	}
	public void setTimesheet(TimeSheet t) {
		idTimesheet = t;
	}
	public TimeSheet getTimesheet() {
		return idTimesheet;
	}
	public void setItemNr(int i) {
		idItemNr = i;
	}
	public int getItemNr() {
		return idItemNr;
	}
	public void setDescription(String desc) {
		idDescription = desc;
	}
	public String getDecription() {
		return idDescription;
	}
	public void setUnit(String unit) {
		idUnit = unit;
	}
	public String getUnit() {
		return idUnit;
	}
	public void setUnitPrice(Currency price) {
		idUnitPrice = price;
	}
	public void setUnitPrice(double price) {
		idUnitPrice = new Currency(price);
	}
	public void setUnitPrice(double price, String currency) {
		idUnitPrice = new Currency(price, currency);
	}
	public Currency getUnitPrice() {
		return idUnitPrice;
	}
	public void setQuantity(double q) {
		idQuantity = q;
	}
	public double getQuantity() {
		return idQuantity;
	}
	public void setDiscount(double d) {
		idDiscount = d;
	}
	public double getDiscount() {
		return idDiscount;
	}
	public String getDiscountString() {
		String tmp = "";
		tmp += idDiscount + "%";
		return tmp;
	}
	public String toString() {
		double tmp = idUnitPrice.getValue() * idQuantity;
		return idQuantity + " " + idUnit + " " + idDescription + " for " + idUnitPrice + ":" + (new Currency(tmp, idUnitPrice.getCurrency())).toString();
	}
}
