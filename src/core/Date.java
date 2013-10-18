package core;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * I am here createing my own date object to make easy set calendar dates.
 */
public class Date {
	private int y;
	private int m;
	private int d;
	
	public Date(int year, int month, int day) {
		y = year;
		m = month;
		d = day;
	}
	
	public void setYear(int year) {
		y = year;
	}
	public void setMonth(int month) {
		m = month;
	}
	public void setDay(int day) {
		d = day;
	}
	public int getYear() {
		return y;
	}
	public int getMonth() {
		return m;
	}
	public int getDay() {
		return d;
	}
	public String toString() {
		return getMonthName() + " " + getDay() + " " + getYear();
	}
	public int[] getDate() {
		int out[] = {};
		out[0] = y;
		out[1] = m;
		out[2] = d;
		return out;
	}
	public String getMonthName() {
		switch (m) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "";
		}
	}

}
