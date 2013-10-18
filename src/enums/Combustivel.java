package enums;

public enum Combustivel {
	gas(0,"Gasolin", "l"),
	activated(1,"Activated Gasolin", "l"),
	diesel(2,"Diesel", "l"),
	lng(3,"LNG", "m³");
	
	private int type;
	private String name;
	private String unit;
	
	private Combustivel(int i, String a, String u) {
		type = i;
		name = a;
		unit = u;
	}
	
	public String toString() {
		return name + ": price per " + unit;
	}
	public String getName() {
		return name;
	}
	public String getUnit() {
		return unit;
	}
	public int getType() {
		return type;
	}
}
