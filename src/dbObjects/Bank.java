package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * Bank object, contains information about bank accounts
 */
public class Bank {
	private int BankID;
	private String BankName;
	private int BankNr;
	private int BankAgency;
	private String BankAccount;
	private String BankAgencyName;
	private Employee BankContactID;
	
	public Bank(int bID) {
		BankID = bID;
	}
	
	public int getID() {
		return BankID;
	}
	public void setBank(String name, int BankIDnr) {
		BankName = name;
		BankNr = BankIDnr;
	}
	public String getBank() {
		return BankName + "(" + BankNr + ")";
	}
	public void setAccount(int Agency, String Account) {
		BankAgency = Agency;
		BankAccount = Account;
	}
	public void setAccount(int Agency, String Account, String AgencyName) {
		BankAgency = Agency;
		BankAccount = Account;
		BankAgencyName = AgencyName;
	}
	public String getAccount() {
		String Tmp;
		if (BankAgencyName.equals("")) Tmp = BankName;
		else Tmp = BankAgencyName;
		return Tmp + ": " + BankAgency + "/" + BankAccount;
	}
	public void setContact(int eID) {
		BankContactID = new Employee(eID);
	}
	public void setContact(Employee e) {
		BankContactID = e;
	}
	public Employee getContact() {
		return BankContactID;
	}
	
	public String toString() {
		return getBank() + "\n" + getAccount();
	}
}
