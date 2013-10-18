package element;

import java.util.Date;

public class TimeSheetNonChargableTime {
	private TimeSheetNonChargableTime nextElement;
	private TimeSheetNonChargableTime previousElement;
	private Date elementStart;
	private Date elementEnd;
	private String elementDescription;
	
	// Time based, use date and time
	
	public TimeSheetNonChargableTime(Date start, Date end, String description) {
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

	public TimeSheetNonChargableTime getNext() {
		return nextElement;
	}
	public TimeSheetNonChargableTime getPrevious() {
		return previousElement;
	}
	public void setNext(TimeSheetNonChargableTime next) {
		nextElement = next;
	}
	public void setPrevious(TimeSheetNonChargableTime previous) {
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
