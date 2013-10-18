package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * This creates an address object, and should be populated from the database.
 * The set*() functions are added to be able to temporarily fix data if the
 * user needs something different at the moment. Note that the add*() functions
 * don't update the database, and next instance of the object returns to
 * old address. A different function should be created to update database
 * instance of the object.
 */
public class Addr {
	private int AddrID; // Primary key autoindex unique
	private String[] AddrStreet;
	private String AddrBuilding;
	private String AddrHouseNr;
	private String AddrOffice;
	private String AddrPostNr;
	private String AddrSuburb;
	private String AddrCity;
	private String AddrState;
	private String AddrCountry;
	private String AddrPostBox;
	private int AddrPhoneCountryCode;
	private int AddrPhoneRegionCode;
	private int AddrPhoneNumber;
	private int AddrPhoneDailin;
	private int AddrMobileCountryCode;
	private int AddrMobileRegionCode;
	private int AddrMobile;
	private int AddrFaxCountryCode;
	private int AddrFaxRegionCode;
	private int AddrFaxNumber;
	private int AddrFaxDailin;
	private boolean AddrFaxIsVoice;
	private String AddrEmail; // formated xxxxxx@xxxx.xxx
	private String AddrSkype;
	private String AddrWeb; // formated http://xxxxxxxx.xxx/
	
	/**
	 * 
	 * @param aID
	 * <p>
	 * Database ID of address, should populate object with the database
	 * instance of Addr
	 */
	public Addr(int aID) {
		AddrID = aID;
	}
	
	public int getAid() {
		return AddrID;
	}
	/**
	 * 
	 * @param Street
	 * An Array of lines to put into Street, mark it can be multiple lines
	 */
	public void setStreet(String[] Street) {
		AddrStreet = Street;
	}
	public String[] getStreet() {
		return AddrStreet;
	}
	public String getStreetFormated() {
		String out = "";
		for (int i = 0; i < AddrStreet.length; i++) {
			out += AddrStreet[i] + "\n";
		}
		return out;
	}
	/**
	 * 
	 * @param Building
	 * <p> Building Name (such as "PetroOffice")
	 * @param HouseNr
	 * <p> Number of building, generally associated with Street
	 * @param Office
	 * <p> Office, or internal location (9th Floor, Suite 2133, etc)
	 */
	public void setBuilding(String Building, String HouseNr, String Office) {
		AddrBuilding = Building;
		AddrHouseNr = HouseNr;
		AddrOffice = Office;
	}
	public String getBuilding() {
		return AddrBuilding;
	}
	public String getHouseNr() {
		return AddrHouseNr;
	}
	public String getOffice() {
		return AddrOffice;
	}
	public void setPostNr(String PostNr) {
		AddrPostNr = PostNr;
	}
	public String getPostNr() {
		return AddrPostNr;
	}
	/**
	 * 
	 * @param Suburb
	 * <p> Suburb of location
	 * @param City
	 * <p> City or Municipality
	 * @param State
	 * <p> State, Regional division or similar (use ISO codes if available)
	 * @param Country
	 * <p> Country, use ISO codes, correct ISO code can assist in setting
	 * up the format of the address when printing out
	 */
	public void setMailAddr(String Suburb, String City, String State, String Country) {
		AddrSuburb = Suburb;
		AddrCity = City;
		AddrState = State;
		AddrCountry = Country;
	}
	public String getSuburb() {
		return AddrSuburb;
	}
	public String getCity() {
		return AddrCity;
	}
	public String getState() {
		return AddrState;
	}
	public String getCountry() {
		return AddrCountry;
	}
	public void setPostBox(String postBox) {
		AddrPostBox = postBox;
	}
	public String getPostBox() {
		return AddrPostBox;
	}
	/**
	 * 
	 * @param CountryCode
	 * @param RegionCode
	 * @param phoneNr
	 * @param Dailin
	 * <p> Format: +{CountryCode} ({RegionCode}) {phoneNR} : {Dailin}<br>
	 * Current version doesn't allow to store leading 0 in numbers
	 */
	public void setPhone(int CountryCode, int RegionCode, int phoneNr, int Dailin) {
		AddrPhoneCountryCode = CountryCode;
		AddrPhoneRegionCode = RegionCode;
		AddrPhoneNumber = phoneNr;
		AddrPhoneDailin = Dailin;
	}
	public String getPhone() {
		String out = "";
		if (AddrPhoneCountryCode > 0) out += "+" + AddrPhoneCountryCode + " ";
		if (AddrPhoneRegionCode > 0) out += "(" + AddrPhoneRegionCode + ") ";
		out += AddrPhoneNumber;
		if (AddrPhoneDailin > 0) out += " : " + AddrPhoneDailin;
		return out;
	}
	/**
	 * 
	 * @param CountryCode
	 * @param RegionCode
	 * @param mobNr
	 * <p> Format: +{CountryCode} ({RegionCode}) {mobNr}<br>
	 * Current version doesn't allow to store leading 0 in numbers
	 */
	public void setMobile(int CountryCode, int RegionCode, int mobNr) {
		AddrMobileCountryCode = CountryCode;
		AddrMobileRegionCode = RegionCode;
		AddrMobile = mobNr;
	}
	public String getMobile() {
		String out = "";
		if (AddrMobileCountryCode > 0) out += "+" + AddrMobileCountryCode + " ";
		if (AddrMobileRegionCode > 0) out += "(" + AddrMobileRegionCode + ") ";
		out += AddrMobile;
		return out;
	}
	/**
	 * 
	 * @param CountryCode
	 * @param RegionCode
	 * @param FaxNumber
	 * @param Dailin
	 * <p> Format: +{CountryCode} ({RegionCode}) {FaxNumber} : {Dailin} <br>
	 * Current version doesn't allow to store leading 0 in numbers
	 * @param isVoice
	 * <p> true if Fax is also used for voice (need to call in to request
	 * fax tone, false if Fax is set to autoaccept
	 */
	public void setFax(int CountryCode, int RegionCode, int FaxNumber, int Dailin, boolean isVoice) {
		AddrFaxCountryCode = CountryCode;
		AddrFaxRegionCode = RegionCode;
		AddrFaxNumber = FaxNumber;
		AddrFaxDailin = Dailin;
		AddrFaxIsVoice = isVoice;
	}
	public String getFax() {
		String out = "";
		if (AddrFaxCountryCode > 0) out += "+" + AddrFaxCountryCode + " ";
		if (AddrFaxRegionCode > 0) out += "(" + AddrFaxRegionCode + ") ";
		out += AddrFaxNumber;
		if (AddrFaxDailin > 0) out += " : " + AddrFaxDailin;
		return out;
	}
	public boolean faxIsVoice() {
		return AddrFaxIsVoice;
	}
	/**
	 * 
	 * @param Email
	 * <p>We do not check the validity of the input here, but should be stored
	 * only in valid eMail format (xxxx@xxxx.xxx)
	 */
	public void setEmail(String Email) { // We are not testing format here
		AddrEmail = Email;
	}
	public String getEmail() {
		return AddrEmail;
	}
	/**
	 * 
	 * @param Skype
	 * <p> Skype caller ID
	 */
	public void setSkype(String Skype) {
		AddrSkype = Skype;
	}
	public String getSkype() {
		return AddrSkype;
	}
	/**
	 * 
	 * @param www
	 * <p>We do not check format here, should store valid web address without
	 * leading "http://" - thus for the page http://someserver.com/mypage.html
	 * the input should be "someserver.com/mypage.html"
	 */
	public void setWeb(String www) { // We are not testing format here
		AddrWeb = www;
	}
	public String getWeb() {
		return "http://" + AddrWeb;
	}
	
	public String toString() {
		return getStreetFormated() + "Phone: " + getPhone() + "\nMobile: " +
				getMobile() + "\nFax: " + getFax() + "\nEmail: " + getEmail();
	}
}
