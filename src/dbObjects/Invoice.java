package dbObjects;

import java.util.ArrayList;
import core.Date;
import core.Exchange;
import core.Currency;

public class Invoice {
	private int InvoiceID;
	private Client InvoiceClient;
	private Project InvoiceProject;
	private Employee InvoiceSeller;
	private int InvoiceNFSE;
	private Currency InvoiceTaxIR;
	private Currency InvoiceTaxPIS;
	private Currency InvoiceTaxCONFIS;
	private Currency InvoiceTaxCSLL;
	private Currency InvoiceTaxISS;
	private Currency InvoiceTaxINSS;
	private Bank InvoiceBank;
	private Date InvoiceDate;
	private Date InvoicePaymentDate;
	private Date InvoicePayedDate;
	private boolean InvoiceArchived;
	private ArrayList<InvoiceDetail> InvoiceDetails;
	private Exchange InvoiceExchange = new Exchange();
	
	public Invoice(int iID) {
		InvoiceID = iID;
	}
	
	public int getID() {
		return InvoiceID;
	}
	public void setClient(int cID) {
		InvoiceClient = new Client(cID);
	}
	public void setClient(Client c) {
		InvoiceClient = c;
	}
	public Client getClient() {
		return InvoiceClient;
	}
	public void setProject(int pID) {
		InvoiceProject = new Project(pID);
	}
	public void setProject(Project p) {
		InvoiceProject = p;
	}
	public Project getProject() {
		return InvoiceProject;
	}
	public void setSeller(int eID) {
		InvoiceSeller = new Employee(eID);
	}
	public void setSeller(Employee e) {
		InvoiceSeller = e;
	}
	public Employee getSeller() {
		return InvoiceSeller;
	}
	public void setNFSE(int NFSE) {
		InvoiceNFSE = NFSE;
	}
	public int getNFSE() {
		return InvoiceNFSE;
	}
	public void setTaxes(double IR, double PIS, double CONFIS, double CSLL, double ISS, double INSS) {
		InvoiceTaxIR = new Currency(IR);
		InvoiceTaxPIS = new Currency(PIS);
		InvoiceTaxCONFIS = new Currency(CONFIS);
		InvoiceTaxCSLL = new Currency(CSLL);
		InvoiceTaxISS = new Currency(ISS);
		InvoiceTaxINSS = new Currency(INSS);
	}
	public Currency[] getTaxes() {
		Currency[] tmp = {};
		tmp[0] = InvoiceTaxIR;
		tmp[1] = InvoiceTaxPIS;
		tmp[2] = InvoiceTaxCONFIS;
		tmp[3] = InvoiceTaxCSLL;
		tmp[4] = InvoiceTaxISS;
		tmp[5] = InvoiceTaxINSS;
		return tmp;
	}
	public Currency getIR() {
		return InvoiceTaxIR;
	}
	public Currency getPIS() {
		return InvoiceTaxPIS;
	}
	public Currency getCONFIS() {
		return InvoiceTaxCONFIS;
	}
	public Currency getCSLL() {
		return InvoiceTaxCSLL;
	}
	public Currency getISS() {
		return InvoiceTaxISS;
	}
	public Currency getINSS() {
		return InvoiceTaxINSS;
	}
	public void setBank(int bID) {
		InvoiceBank = new Bank(bID);
	}
	public void setBank(Bank b) {
		InvoiceBank = b;
	}
	public Bank getBank() {
		return InvoiceBank;
	}
	public void setDate(int year, int month,int day) {
		InvoiceDate = new Date(year,month,day);
	}
	public Date getDate() {
		return InvoiceDate;
	}
	public void setPaymentDate(int year, int month, int day) {
		InvoicePaymentDate = new Date(year, month, day);
	}
	public Date getPaymentDate(int year, int month, int day) {
		return InvoicePaymentDate;
	}
	public void setPayedDate(int year, int month, int day) {
		InvoicePayedDate = new Date(year, month, day);
	}
	public Date getPayedDate() {
		return InvoicePayedDate;
	}
	public void setArchived() {
		InvoiceArchived = true;
	}
	public void unsetArchived() {
		InvoiceArchived = false;
	}
	public boolean isArchived() {
		return InvoiceArchived;
	}
	public void addInvoiceDetail(String unit, double unitPrice, double quantity, String currency) {
		InvoiceDetail tmp = new InvoiceDetail(this);
		tmp.setUnit(unit);
		tmp.setQuantity(quantity);
		tmp.setUnitPrice(unitPrice, currency);
		InvoiceDetails.add(tmp);
	}
	
	public void addExchange(String currency, double rate) {
		InvoiceExchange.addExchange(currency, rate);
	}
	public void setExchange(String currency, double rate) {
		InvoiceExchange.setExchange(currency, rate);
	}
	public void removeExchange(String currency) {
		InvoiceExchange.removeExchange(currency);
	}
	public double queryExchange(String currency) {
		return InvoiceExchange.queryExchange(currency);
	}
}
