package element;

public class TimeSheetElement {
	private TimeSheetElement nextElement;
	private TimeSheetElement previousElement;
	private TimeSheetChargableTime myChargableTime;
	private TimeSheetNonChargableTime myNonChargable;
	private TimeOffLeaveElement myLeave;
	private TimeOffLieuElement myLieu;
	
	private TravelExpenseElement myTravelExpense;

	private String myTimeSheetOwner;
	
	private String myTimeSheetJobName;
	private String myTimeSheetJobRef;

	public TimeSheetElement(String owner, String jobName, String jobRef) {
		myTimeSheetOwner = owner;
		myTimeSheetJobName = jobName;
		myTimeSheetJobRef = jobRef;
	}

	public String getJobRef() {
		return myTimeSheetJobRef;
	}
	public void setJobRef(String jobRef) {
		myTimeSheetJobRef = jobRef;
	}
	public String getJobName() {
		return myTimeSheetJobName;
	}
	public void setJobName(String jobName) {
		myTimeSheetJobName = jobName;
	}
	public String getOwner() {
		return myTimeSheetOwner;
	}
	public void setOwner(String owner) {
		myTimeSheetOwner = owner;
	}
	
	public TimeOffLeaveElement getLeave() {
		return myLeave;
	}
	public TimeOffLieuElement getLieu() {
		return myLieu;
	}
	public TimeSheetChargableTime getChargableTime() {
		return myChargableTime;
	}
	public TimeSheetNonChargableTime getNonChargableTime() {
		return myNonChargable;
	}
	public TravelExpenseElement getTravelExpense() {
		return myTravelExpense;
	}
	
	public TimeSheetElement getNext() {
		return nextElement;
	}
	public TimeSheetElement getPrevious() {
		return previousElement;
	}
	public void setNext(TimeSheetElement next) {
		nextElement = next;
	}
	public void setPrevious(TimeSheetElement previous) {
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
