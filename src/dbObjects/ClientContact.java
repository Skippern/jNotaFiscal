package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * This creates a Client Contact that links to a Client object - <br>
 * This should in turn allow to create a list of contacts, either
 * depending on Client (company), or combined with companies without
 * contacts
 * <p>
 * Contacts not linked to a Client (company) should be considered personal
 * clients (i.e. doing service for a private person without registered CNPJ
 */
public class ClientContact {
	/*
	ID = primary key autoindex unique INT
	Title = TEXT
	FirstName = TEXT
	MiddleName = TEXT
	LastName = TEXT
	Suffix = TEXT
	NickName = TEXT
	CPF = TEXT formated nnn.nnn.nnn-nn
	ClientID = INT relation to Client.ID
	AddrID = INT relation to Address.ID
	Photo = INT relation ImagePersonPhoto.ID
	*/
	private int ClientContactID;
	private String ClientContactTitle;
	private String ClientContactFirstName;
	private String ClientContactMiddleName;
	private String ClientContactLastName;
	private String ClientContactSuffix;
	private String ClientContactNickName;
	private String ClientContactCPF;
	private Client ClientContactClientID;
	private Addr ClientContactAddr;
	
	/**
	 * 
	 * @param ccID
	 * <p> The Client Contact database ID, this function should populate
	 * the object with data from the database instance of Client Contact
	 */
	public ClientContact(int ccID) {
		ClientContactID = ccID;
	}
	
	public int getCcid() {
		return ClientContactID;
	}
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * <p>Firstname and Lastname of Client contact, both MUST be set
	 */
	public void setName(String firstName, String lastName) {
		ClientContactFirstName = firstName;
		ClientContactLastName = lastName;
	}
	/**
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * <p>First, middle and Last name of Client contact, first and last is
	 * obligatory
	 */
	public void setName(String firstName, String middleName, String lastName) {
		ClientContactFirstName = firstName;
		ClientContactMiddleName = middleName;
		ClientContactLastName = lastName;
	}
	/**
	 * 
	 * @param title
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param suffix
	 * <p>First, middle and last name of Client contact, with title and
	 * suffix<br>Title, middlename and suffix can be replaced by null if
	 * not to be set. First and last names obligatory.
	 */
	public void setName(String title, String firstName, String middleName, String lastName, String suffix) {
		ClientContactTitle = title;
		ClientContactFirstName = firstName;
		ClientContactMiddleName = middleName;
		ClientContactLastName = lastName;
		ClientContactSuffix = suffix;
	}
	public String getName() {
		String out = "";
		if (!ClientContactTitle.equals("")) out += ClientContactTitle + " ";
		out += ClientContactFirstName + " ";
		if (!ClientContactMiddleName.equals("")) out += ClientContactMiddleName + " ";
		out += ClientContactLastName;
		if (!ClientContactSuffix.equals("")) out += " " + ClientContactSuffix;
		return out;
	}
	/**
	 * 
	 * @param nick
	 * <p>A nick name, short name for "known as", sometimes this is the name
	 * they are known as, so must be searchable
	 */
	public void setNickName(String nick) {
		ClientContactNickName = nick;
	}
	public String getNickName() {
		return ClientContactNickName;
	}
	/**
	 * 
	 * @param CPF
	 * <p>Formated nnn.nnn.nnn-nn
	 */
	public void setCPF(String CPF) {
		ClientContactCPF = CPF;
	}
	public String getCPF() {
		return ClientContactCPF;
	}
	/**
	 * 
	 * @param cID
	 * <p>Database ID of company this Contact represents, if unset
	 * he does not represent a company but should show up in the 
	 * list as possible clients (without registered CNPJ)
	 */
	public void setClient(int cID) {
		ClientContactClientID = new Client(cID);
	}
	public Client getClient() {
		return ClientContactClientID;
	}
	/**
	 * 
	 * @param aID
	 * <p>Database ID of this contacts address, wether it is the
	 * company address, his specific office address, or private, is
	 * up to the register
	 */
	public void setAddr(int aID) {
		ClientContactAddr = new Addr(aID);
	}
	public Addr getAddr() {
		return ClientContactAddr;
	}
}
