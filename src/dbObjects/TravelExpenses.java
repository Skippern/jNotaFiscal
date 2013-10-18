package dbObjects;

import java.util.ArrayList;

import core.Currency;
import core.Date;
import core.Exchange;

public class TravelExpenses {
	private int TravelExpenseID;
	private TimeSheet TravelExpenseTsheet;
	private Bank TravelExpenseBank;
	private Employee TravelExpenseEmployee;
	private String TravelExpenseComment;
	private Date TravelExpenseReceived;
	private boolean TravelExpenseArchived;
	private ArrayList<TravelExpenseDetail> TravelExpenseDetails;
	private ArrayList<TravelExpenseMilage> TravelMiles;
	
	public TravelExpenses(TimeSheet t) {
		TravelExpenseID = -1;
		TravelExpenseTsheet = t;
	}
	public int getID() {
		return TravelExpenseID;
	}
	public TimeSheet getTimesheet() {
		return TravelExpenseTsheet;
	}
	public void setBank(Bank b) {
		TravelExpenseBank = b;
	}
	public Bank getBank() {
		return TravelExpenseBank;
	}
	public void setEmployee(Employee e) {
		TravelExpenseEmployee = e;
	}
	public Employee getEmployee() {
		return TravelExpenseEmployee;
	}
	public void setComment(String comment) {
		TravelExpenseComment = comment;
	}
	public String getComment() {
		return TravelExpenseComment;
	}
	public void setReceived(int year, int month, int day) {
		TravelExpenseReceived = new Date(year, month, day);
	}
	public Date getReceived() {
		return TravelExpenseReceived;
	}
	public void setArchived() {
		TravelExpenseArchived = true;
	}
	public void unsetArchived() {
		TravelExpenseArchived = false;
	}
	public boolean isArchived() {
		return TravelExpenseArchived;
	}
	public void addDetail(int ExpenceCat, Currency expence, Exchange exchange) {
		TravelExpenseDetail tmp = new TravelExpenseDetail(this);
		tmp.setCategory(ExpenceCat);
		tmp.setExpence(expence);
		tmp.setExchange(exchange);
		TravelExpenseDetails.add(tmp);
	}
	public void addDetail(int ExpenceCat, Currency expence) {
		TravelExpenseDetail tmp = new TravelExpenseDetail(this);
		tmp.setCategory(ExpenceCat);
		tmp.setExpence(expence);
		TravelExpenseDetails.add(tmp);
	}
	public void addDetail(int ExpenceCat, double expence) {
		TravelExpenseDetail tmp = new TravelExpenseDetail(this);
		tmp.setCategory(ExpenceCat);
		tmp.setExpence(new Currency(expence));
		TravelExpenseDetails.add(tmp);
	}
	public void addMilage(String from, String to, double distance) {
		TravelExpenseMilage tmp = new TravelExpenseMilage(this, from, to, distance);
		TravelMiles.add(tmp);
	}
	
	public String toString() {
		return "Travel Expenses for: " + TravelExpenseEmployee;
	}

}
