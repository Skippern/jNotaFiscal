package dbObjects;

import java.util.ArrayList;
import core.Time;
import core.Date;

public class TimeSheet {
	private int tsID;
	private Employee tsEmployee;
	private Project tsProject;
	private boolean tsArchived;
	private boolean tsInvoiced;
	private ArrayList<TimeSheetDetail> tsDetails;

	public TimeSheet(Project p, Employee e) {
		tsID = -1;
		tsEmployee = e;
		tsProject = p;
	}
	public int getID() {
		return tsID;
	}
	public Employee getEmployee() {
		return tsEmployee;
	}
	public Project getProject() {
		return tsProject;
	}
	public void setArchived() {
		tsArchived = true;
	}
	public void unsetArchived() {
		tsArchived = false;
	}
	public boolean isArchived() {
		return tsArchived;
	}
	public void setInvoiced() {
		tsInvoiced = true;
	}
	public void unsetInvoiced() {
		tsInvoiced = false;
	}
	public boolean isInvoiced() {
		return tsInvoiced;
	}
	public void addDetail(Date day, Time start, Time end, String title, String detail, boolean invoice) {
		TimeSheetDetail tmp = new TimeSheetDetail(this);
		int[] tmpdate = day.getDate();
		tmp.setDate(tmpdate[0], tmpdate[1], tmpdate[2]);
		int[] tmptime = start.getTime();
		tmp.setStartTime(tmptime[0], tmptime[1]);
		tmptime = end.getTime();
		tmp.setEndTime(tmptime[0], tmptime[1]);
		tmp.setTitle(title);
		tmp.setDetail(detail);
		if (invoice) tmp.setInvoicable();
		else tmp.unsetInvoicable();
		tsDetails.add(tmp);
	}
}
