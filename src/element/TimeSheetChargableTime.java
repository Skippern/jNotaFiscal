package element;

import java.util.Date;

public class TimeSheetChargableTime {
	private TimeSheetChargableTime nextElement;
	private TimeSheetChargableTime previousElement;
	private Date elementStart;
	private Date elementEnd;
	private String elementDescription;
	
	// Time based, use date and time
	
	public TimeSheetChargableTime(Date start, Date end, String description) {
		elementStart = start;
		elementEnd = end;
		elementDescription = description;
	}
	
	public double getDuration() {
		return (double) (elementEnd.getTime() - elementStart.getTime()) / 3600000.0;
	}
	public String getDescription() {
		return elementDescription;
	}

	public TimeSheetChargableTime getNext() {
		return nextElement;
	}
	public TimeSheetChargableTime getPrevious() {
		return previousElement;
	}
	public void setNext(TimeSheetChargableTime next) {
		nextElement = next;
	}
	public void setPrevious(TimeSheetChargableTime previous) {
		previousElement = previous;
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
