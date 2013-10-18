package dbObjects;

import core.Currency;
import core.Exchange;

public class TravelExpenseDetail {
	private int tedID;
	private int tedCategoryID;
	private String[] tedCategories = dbObjects.TravelExpenseCategory.TECategory;
	private Currency tedExpence;
	private Exchange tedExchange;
	private TravelExpenses tedBill;

	public TravelExpenseDetail(TravelExpenses t) {
		tedID = -1;
		tedBill = t;
	}
	public int getID() {
		return tedID;
	}
	public TravelExpenses getExpenses() {
		return tedBill;
	}
	public void setExpence(Currency c) {
		tedExpence = c;
	}
	public void setExpence(double Value) {
		tedExpence = new Currency(Value);
	}
	public void setExpence(double Value, String currency) {
		tedExpence = new Currency(Value, currency);
	}
	public Currency getExpence() {
		return tedExpence;
	}
	public void setExchange(Exchange e) {
		tedExchange = e; // this must be linked to an invoice, or spawned specifically
	}
	public Exchange getExchange() {
		return tedExchange;
	}
	public void setCategory(int i) {
		tedCategoryID = i;
	}
	public String getCategory() {
		return tedCategories[tedCategoryID];
	}
	
}
