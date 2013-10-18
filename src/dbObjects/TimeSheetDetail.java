package dbObjects;

import core.Date;
import core.Time;

public class TimeSheetDetail {
	private int tsdID;
	private TimeSheet tsdSheet;
	private Date tsdDate;
	private Time tsdStartTime;
	private Time tsdEndTime;
	private String tsdTitle;
	private String tsdDetail;
	private boolean tsdInvoicable;

	public TimeSheetDetail(TimeSheet t) {
		tsdID = -1;
		tsdSheet = t;
	}
	public int getID() {
		return tsdID;
	}
	public TimeSheet getTimeSheet() {
		return tsdSheet;
	}
	public void setDate(int year, int month, int day) {
		tsdDate = new Date(year,month,day);
	}
	public Date getDate() {
		return tsdDate;
	}
	public void setStartTime(int hour, int minute) {
		tsdStartTime = new Time(hour, minute);
	}
	public Time getStartTime() {
		return tsdStartTime;
	}
	public void setEndTime(int hour, int minute) {
		tsdEndTime = new Time(hour, minute);
	}
	public Time getEndTime() {
		return tsdEndTime;
	}
	public void setTitle(String title) {
		tsdTitle = title;
	}
	public String getTitle() {
		return tsdTitle;
	}
	public void setDetail(String detail) {
		tsdDetail = detail;
	}
	public String getDetail() {
		return tsdDetail;
	}
	public void setInvoicable() {
		tsdInvoicable = true;
	}
	public void unsetInvoicable() {
		tsdInvoicable = false;
	}
	public boolean isInvoicable() {
		return tsdInvoicable;
	}
	
	public String toString() {
		return tsdDate + ":" + tsdStartTime + "-" + tsdEndTime + ": " + tsdTitle;
	}

}
