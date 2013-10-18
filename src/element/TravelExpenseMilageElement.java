package element;

import java.util.Calendar;
import java.util.Date;

public class TravelExpenseMilageElement {
	private TravelExpenseMilageElement nextElement;
	private TravelExpenseMilageElement previousElement;
	private String travelTo;
	private String travelFrom;
	private double startKM;
	private double endKM;
	private Date startTime;
	private Date endTime;
	private boolean isMile = false;
	
	public TravelExpenseMilageElement(String from, String to, double distance) {
		travelFrom = from;
		travelTo = to;
		startKM = 0.0;
		endKM = distance;
		// This is kilometer
	}
	public TravelExpenseMilageElement(String from, String to, double distance, boolean mile) {
		travelFrom = from;
		travelTo = to;
		startKM = 0.0;
		endKM = distance;
		// This one can be set to miles
		isMile = mile;
	}
	public TravelExpenseMilageElement(String from, String to, double start, double end) {
		travelFrom = from;
		travelTo = to;
		startKM = start;
		endKM = end;
		// This is kilometer
	}
	public TravelExpenseMilageElement(String from, String to, double start, double end, boolean mile) {
		travelFrom = from;
		travelTo = to;
		startKM = start;
		endKM = end;
		// This one can be set to miles
		isMile = mile;
	}
	
	public void setStartTime(Date start) {
		startTime = start;
	}
	public void setEndTime(Date end) {
		endTime = end;
	}
	
	public void setTime(Calendar start, Calendar end) {
		startTime = start.getTime();
		endTime = end.getTime();
	}
	public void setTime(Date start, Date end) {
		startTime = start;
		endTime = end;
	}
	public Calendar getCalendarDate() {
		Calendar myCalendar;
		myCalendar = Calendar.getInstance();
		myCalendar.setTime(startTime);
		
		return myCalendar;
	}
	public String getDate() {
		return getCalendarDate().toString();
	}
	public double getDuration() {
		if (startTime == null || endTime == null) return 0.0;
		double millisecs = (double) (endTime.getTime() - startTime.getTime());
		
		// We now have the difference in milliseconds, we want it in hours
		return millisecs / 3600000;
	}
	public String getDurationText() {
		int hour = (int) getDuration();
		double timeLeft = getDuration() - (double) hour;
		int minute = (int) (timeLeft * 60.0);
		
		return hour + ":" + minute + "h";
	}
	
	public double getAvgSpeed() {
		return getDistance() / getDuration();
	}
	public double getAvgSpeedMiles() {
		return getDistanceInMile() / getDuration();
	}
	
	public void setTripCounter(double start, double end) {
		startKM = start;
		endKM = end;
	}
	public void setMile(boolean mile) {
		isMile = mile;
	}
	public void setOrigen(String from) {
		travelFrom = from;
	}
	public void setDestination(String to) {
		travelTo = to;
	}
	public String getOrigen() {
		return travelFrom;
	}
	public String getDestination() {
		return travelTo;
	}
	public double getDistance() {
		if (isMile == true) return (endKM - startKM) * 1.609344;
		return endKM - startKM;	
	}
	public double getDistanceInMile() {
		if (isMile == true) return endKM - startKM;
		return (endKM - startKM) * 0.6213712;
	}
	
	public void setNext(TravelExpenseMilageElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseMilageElement previous) {
		previousElement = previous;
	}
	
	public TravelExpenseMilageElement getNext() {
		return nextElement;
	}
	public TravelExpenseMilageElement getPrevious() {
		return previousElement;
	}
	
	public String toString() {
		return getOrigen() + " - " + getDestination() + ": " + getDistance() + "km";
	}

	public void moveUp() {
		// Swap with next in list
		System.out.println("Move up not implemented in TravelExpenseMilage");
	}
	public void moveDown() {
		//Swap with previous in list
		System.out.println("Move down not implemented in TravelExpenseMilage");
	}
	
	public void killElement() {
		if (nextElement != null) {
			if (previousElement != null) nextElement.setPrevious(previousElement);
			else nextElement.setPrevious(null);
		} else if (previousElement != null) {
			if (nextElement != null) previousElement.setNext(nextElement);
			else previousElement.setNext(null);
		}
	} 
}
