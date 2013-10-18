package dbObjects;

public class NextOfKin {
	private int nokID;
	private String nokTitle;
	private String nokFirstName;
	private String nokMiddleName;
	private String nokLastName;
	private String nokSuffix;
	private String nokNickName;
	private Addr nokAddr;
	private String nokRelation;
	
	NextOfKin(int NokID) {
		nokID = NokID;
	}

	public int getID() {
		return nokID;
	}
	public void setName(String firstName, String lastName) {
		nokFirstName = firstName;
		nokLastName = lastName;
	}
	public void setName(String firstName, String middleName, String lastName) {
		nokFirstName = firstName;
		nokMiddleName = middleName;
		nokLastName = lastName;
	}
	public void setName(String title, String firstName, String middleName, String lastName, String suffix) {
		nokTitle = title;
		nokFirstName = firstName;
		nokMiddleName = middleName;
		nokLastName = lastName;
		nokSuffix = suffix;
	}
	public String getName() {
		String out = "";
		if (!nokTitle.equals("")) out += nokTitle + " ";
		out += nokFirstName + " ";
		if (!nokMiddleName.equals("")) out += nokMiddleName + " ";
		out += nokLastName;
		if (!nokSuffix.equals("")) out += " " + nokSuffix;
		return out;
	}
	public void setAddr(int aID) {
		nokAddr = new Addr(aID);
	}
	public void setAddr(Addr a) {
		nokAddr = a;
	}
	public Addr getAddr() {
		return nokAddr;
	}
	public void setNickName(String nick) {
		nokNickName = nick;
	}
	public String getNickName() {
		return nokNickName;
	}
	public void setRelation(String relation) {
		nokRelation = relation;
	}
	public String getRelation() {
		return nokRelation;
	}
	public String toString() {
		return nokRelation + ": " + nokFirstName + " " + nokLastName;
	}

}
