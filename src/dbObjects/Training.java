package dbObjects;

//import java.util.Calendar;
import core.*;

/**
 * 
 * @author Aun Johnsen
 * <p>
 * This object is tracking the training of Employee objects, they should
 * be inherited into the Employee object which they refers to
 */
public class Training {
	private int TrainingID;
	private Employee TrainingEmployee;
	private String TrainingName;
	private String TrainingFacility;
	private Date TrainingStartDate;
	private Date TrainingEndDate;
	private Date TrainingValidityDate;
	private boolean TrainingCertificate;
	private Date TrainingIssueDate;
	
	public Training(int tID) {
		TrainingID = tID;
	}
	
	public int getID() {
		return TrainingID;
	}
	public void setEmployee(int eID) {
		TrainingEmployee = new Employee(eID);
	}
	public void setEmployee(Employee e) {
		TrainingEmployee = e;
	}
	public Employee getEmployee() {
		return TrainingEmployee;
	}
	public void setName(String name) {
		TrainingName = name;
	}
	public String getName() {
		return TrainingName;
	}
	public void setFacility(String fac) {
		TrainingFacility = fac;
	}
	public String getFacility() {
		return TrainingFacility;
	}
	
	public void setCertificate() {
		TrainingCertificate = true;
	}
	public void unsetCertificate() {
		TrainingCertificate = false;
	}
	public boolean isCertificate() {
		return TrainingCertificate;
	}
	public void setStartDate(int year, int month, int day) {
		TrainingStartDate = new Date(year, month, day);
	}
	public Date getStartDate() {
		return TrainingStartDate;
	}
	public void setEndDate(int year, int month, int day) {
		TrainingEndDate = new Date(year, month, day);
	}
	public Date getEndDate() {
		return TrainingEndDate;
	}
	public void setValidity(int year, int month, int day) {
		TrainingValidityDate = new Date(year, month, day);
	}
	public Date getValidity() {
		return TrainingValidityDate;
	}
	public void setIssueDate(int year, int month, int day) {
		TrainingIssueDate = new Date(year, month, day);
	}
	public Date getIssueDate() {
		return TrainingIssueDate;
	}
	
	public String toString() {
		return TrainingName + " / " + TrainingFacility + 
				"(" + TrainingEndDate.getYear() + ")";
	}
}
