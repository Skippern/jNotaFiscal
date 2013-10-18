package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * <p>
 * This should create a list of categories that can be used where needed
 */
public class Category {
	private int CategoryID;
	private String CategoryName;
	private String CategoryDesc;
	private boolean CategoryIsService;
	private boolean CategoryIsRental;
	private boolean CategoryIsSale;
	private boolean CategoryIsProject;
	private boolean CategoryIsOrder;
	private boolean CategoryIsProduct;
	
	/**
	 * 
	 * @param catID
	 * <p>Category ID from database, should populate object with instance
	 * from database
	 */
	public Category(int catID) {
		CategoryID = catID;
	}
	
	public int getID() {
		return CategoryID;
	}
	public void setName(String name) {
		CategoryName = name;
	}
	public String getName() {
		return CategoryName;
	}
	public void setDescription(String desc) {
		CategoryDesc = desc;
	}
	public String getDescription() {
		return CategoryDesc;
	}
	public void setService(boolean Service) {
		CategoryIsService = Service;
	}
	public boolean isService() {
		return CategoryIsService;
	}
	public void setRental(boolean Rental) {
		CategoryIsRental = Rental;
	}
	public boolean isRental() {
		return CategoryIsRental;
	}
	public void setSale(boolean sale) {
		CategoryIsSale = sale;
	}
	public boolean isSale() {
		return CategoryIsSale;
	}
	public void setProject(boolean proj) {
		CategoryIsProject = proj;
	}
	public boolean isProject() {
		return CategoryIsProject;
	}
	public void setOrder(boolean order) {
		CategoryIsOrder = order;
	}
	public boolean isOrder() {
		return CategoryIsOrder;
	}
	public void setProduct(boolean product) {
		CategoryIsProduct = product;
	}
	public boolean isProduct() {
		return CategoryIsProduct;
	}
	
	public String toString() {
		return getName() + ": " + getDescription();
	}
}
