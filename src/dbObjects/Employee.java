package dbObjects;

import java.util.*;
import core.Date;

/**
 * 
 * @author Aun Johnsen
 * <p>
 * The Employee object links each Employee with other objects. This is
 * necessary to keep track of invoices, travel expenses, timesheets,
 * projects and much more
 */
public class Employee {
	private int EmployeeID;
	private String EmployeeTitle;
	private String EmployeeFirstName;
	private String EmployeeMiddleName;
	private String EmployeeLastName;
	private String EmployeeSuffix;
	private String EmployeeNickName;
	private String EmployeeCPF;
	private Addr EmployeeAddr;
	private Bank EmployeeBank;
	private boolean EmployeeIsSeller;
	private boolean EmployeeMaleFemale;
	private int EmployeeShoesize;
	private String EmployeeCoverall;
	private String EmployeeTShirt;
	private ArrayList<Training> EmployeeTraining;
	private ArrayList<NextOfKin> EmployeeNOK;
	
	public Employee(int eID) {
		EmployeeID = eID;
	}
	
	public int getID() {
		return EmployeeID;
	}
	public void setName(String firstName, String lastName) {
		EmployeeFirstName = firstName;
		EmployeeLastName = lastName;
	}
	public void setName(String firstName, String middleName, String lastName) {
		EmployeeFirstName = firstName;
		EmployeeMiddleName = middleName;
		EmployeeLastName = lastName;
	}
	public void setName(String title, String firstName, String middleName, String lastName, String suffix) {
		EmployeeTitle = title;
		EmployeeFirstName = firstName;
		EmployeeMiddleName = middleName;
		EmployeeLastName = lastName;
		EmployeeSuffix = suffix;
	}
	public String getName() {
		String out = "";
		if (!EmployeeTitle.equals("")) out += EmployeeTitle + " ";
		out += EmployeeFirstName + " ";
		if (!EmployeeMiddleName.equals("")) out += EmployeeMiddleName + " ";
		out += EmployeeLastName;
		if (!EmployeeSuffix.equals("")) out += " " + EmployeeSuffix;
		return out;
	}
	public String[] getNameSortable() {
		String[] out = {};
		out[0] = EmployeeTitle;
		out[1] = EmployeeFirstName;
		out[2] = EmployeeMiddleName;
		out[3] = EmployeeLastName;
		out[4] = EmployeeSuffix;
		return out;
	}
	public void setNickName(String nick) {
		EmployeeNickName = nick;
	}
	public String getNickName() {
		return EmployeeNickName;
	}
	public void setCPF(String CPF) {
		EmployeeCPF = CPF;
	}
	public String getCPF() {
		return EmployeeCPF;
	}
	public void setAddr(int aID) {
		EmployeeAddr = new Addr(aID);
	}
	public void setAddr(Addr a) {
		EmployeeAddr = a;
	}
	public Addr getAddr() {
		return EmployeeAddr;
	}
	public void setBank(int bID) {
		EmployeeBank = new Bank(bID);
	}
	public void setBank(Bank b) {
		EmployeeBank = b;
	}
	public Bank getBank() {
		return EmployeeBank;
	}
	public void setSeller() {
		EmployeeIsSeller = true;
	}
	public void unsetSeller() {
		EmployeeIsSeller = false;
	}
	public boolean isSeller() {
		return EmployeeIsSeller;
	}
	public void setMaleFemale(boolean M) {
		EmployeeMaleFemale = M;
	}
	public boolean isMale() {
		return EmployeeMaleFemale;
	}
	public boolean isFemale() {
		return !EmployeeMaleFemale;
	}
	public void setShoeSize(int size) {
		EmployeeShoesize = size;
	}
	public int getShoeSize() {
		return EmployeeShoesize;
	}
	public void setCoverallSize(String size) {
		EmployeeCoverall = size;
	}
	public String getCoverallSize() {
		return EmployeeCoverall;
	}
	public void setTShirtSize(String size) {
		EmployeeTShirt = size;
	}
	public String getTShirtSize() {
		return EmployeeTShirt;
	}
	public String toString() {
		return "(" + getID() + ") " + getName();
	}
	
	public void addTraining(String Course, String Center, Date StartDate, Date EndDate, Date Validity) {
		Training tmp = new Training(666); // get proper code
		int[] tmpdate = {};
		tmp.setName(Course);
		tmp.setFacility(Center);
		tmp.setEmployee(this);
		tmpdate = StartDate.getDate();
		tmp.setStartDate(tmpdate[0], tmpdate[1], tmpdate[2]);
		tmpdate = EndDate.getDate();
		tmp.setEndDate(tmpdate[0], tmpdate[1], tmpdate[2]);
		tmpdate = Validity.getDate();
		tmp.setValidity(tmpdate[0], tmpdate[1], tmpdate[2]);
		EmployeeTraining.add(tmp);
	}
	public void addTraining(boolean Cert, String Name, String Issuer, Date IssueDate, Date Validity) {
		Training tmp = new Training(999); // get proper code
		int[] tmpdate = {};
		tmp.setName(Name);
		tmp.setFacility(Issuer);
		tmp.setEmployee(this);
		if (Cert) tmp.setCertificate();
		else tmp.unsetCertificate();
		tmpdate = IssueDate.getDate();
		tmp.setIssueDate(tmpdate[0], tmpdate[1], tmpdate[2]);
		tmpdate = Validity.getDate();
		tmp.setValidity(tmpdate[0], tmpdate[1], tmpdate[2]);
		EmployeeTraining.add(tmp);
	}
	public ArrayList<Training> getTraining() {
		return EmployeeTraining;
	}
	public void addNextOfKin(int NokID) {
		NextOfKin tmp = new NextOfKin(NokID);
		EmployeeNOK.add(tmp);
	}
	public void addNextOfKin(NextOfKin nok) {
		EmployeeNOK.add(nok);
	}
	public ArrayList<NextOfKin> getNextOfKin() {
		return EmployeeNOK;
	}
	
}
