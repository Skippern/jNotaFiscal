package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * This is the client object. It should on creation be populated from
 * the database. The set*() functions are added in order to manipulate
 * data locally without reloading the object from the database. Ideally
 * this should update the database instance as well, but at time of creation
 * of this it is unsure if this should be automated or done by manual updates
 */
public class Client {
	private int ClientID; // primary key autoindex unique 
	private String ClientCompanyName;
	private String ClientCNPJ; // formated nn.nnn.nnn/nnnn-nn
	private String ClientUnit;
	private Addr ClientAddr;
	
	/**
	 * 
	 * @param cID
	 * <p>
	 * Database ID of client, should populate object with the database
	 * instance of the Client.
	 */
	public Client(int cID) {
		ClientID = cID;
	}
	
	public int getCid() {
		return ClientID;
	}
	public void setCompanyName(String name) {
		ClientCompanyName = name;
	}
	public String getCompanyName() {
		return ClientCompanyName;
	}
	public void setCNPJ(String formated) {
		ClientCNPJ = formated;
	}
	public String getCNPJ() {
		return ClientCNPJ;
	}
	public void setUnit(String unit) {
		ClientUnit = unit;
	}
	public String getUnit() {
		return ClientUnit;
	}
	public void setAddr(int aID) {
		ClientAddr = new Addr(aID);
	}
	public Addr getAddr() {
		return ClientAddr;
	}
	
	public String toString() {
		return getCompanyName() + "\nCNPJ: " + getCNPJ() + "\n" + getAddr().toString();
	}
}
