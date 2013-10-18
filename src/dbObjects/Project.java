package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * This object should give access to the database content of projects, there
 * will be many objects linking to and from here
 */
public class Project {
	private int ProjectID;
	private String ProjectName;
	private int ProjectNumber;
	private Client ProjectClient;
	private ClientContact ProjectClientContact;
	private Category ProjectCategory;
	private Employee ProjectResponsible;
	private boolean ProjectArchived;
	
	public Project(int pID) {
		ProjectID = pID;
	}
	
	public int getID() {
		return ProjectID;
	}
	public void setProjectName(String name) {
		ProjectName = name;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectNumber(int pNr) {
		ProjectNumber = pNr;
	}
	public int getProjectNumber() {
		return ProjectNumber;
	}
	public void setClient(int cID) {
		ProjectClient = new Client(cID);
	}
	public void setClient(Client c) {
		ProjectClient = c;
	}
	public Client getClient() {
		return ProjectClient;
	}
	public void setClientContact(int ccID) {
		ProjectClientContact = new ClientContact(ccID);
	}
	public void setClientContact(ClientContact c) {
		ProjectClientContact = c;
	}
	public ClientContact getClientContact() {
		return ProjectClientContact;
	}
	public void setCategory(int catID) {
		ProjectCategory = new Category(catID);
	}
	public void setCategory(Category c) {
		ProjectCategory = c;
	}
	public Category getCategory() {
		return ProjectCategory;
	}
	public void setResponsible(int eID) {
		ProjectResponsible = new Employee(eID);
	}
	public void setResponsible(Employee e) {
		ProjectResponsible = e;
	}
	public Employee getResponsible() {
		return ProjectResponsible;
	}
	public void setArchived() {
		ProjectArchived = true;
	}
	public void unsetArchived() {
		ProjectArchived = false;
	}
	public boolean isArchived() {
		return ProjectArchived;
	}
	
	public String toString() {
		String out = "";
		if (isArchived()) out += "(Archived) ";
		out += getProjectName() + " (" + getProjectNumber() + ")";
		return out;
	}
}
