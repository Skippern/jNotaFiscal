package element;

import java.util.Date;

public class TimeOffLeaveElement {
	private TimeOffLeaveElement nextElement;
	private TimeOffLeaveElement previousElement;
	private Date elementDate;
	private String elementReason;
	
	// Whole day element, use date only, no time
	
	public TimeOffLeaveElement(Date date) {
		elementDate = date;
	}
	public TimeOffLeaveElement(Date date, String reason) {
		elementDate = date;
		elementReason = reason;
	}
	public Date getDate() {
		return elementDate;
	}
	public String getReason() {
		return elementReason;
	}
	public TimeOffLeaveElement getNext() {
		return nextElement;
	}
	public TimeOffLeaveElement getPrevious() {
		return previousElement;
	}
	public void setNext(TimeOffLeaveElement next) {
		nextElement = next;
	}
	public void setPrevious(TimeOffLeaveElement previous) {
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
