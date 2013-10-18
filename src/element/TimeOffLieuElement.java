package element;

import java.util.Date;

public class TimeOffLieuElement {
	private TimeOffLieuElement nextElement;
	private TimeOffLieuElement previousElement;
	private Date elementDate;
	private String elementReason;
	
	// Whole day element, use date only, no time
	
	public TimeOffLieuElement(Date date) {
		elementDate = date;
	}
	public TimeOffLieuElement(Date date, String reason) {
		elementDate = date;
		elementReason = reason;
	}
	public Date getDate() {
		return elementDate;
	}
	public String getReason() {
		return elementReason;
	}
	public TimeOffLieuElement getNext() {
		return nextElement;
	}
	public TimeOffLieuElement getPrevious() {
		return previousElement;
	}
	public void setNext(TimeOffLieuElement next) {
		nextElement = next;
	}
	public void setPrevious(TimeOffLieuElement previous) {
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
