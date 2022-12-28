/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Asset Inheritance - Practice with Inheritance
 */

public class Building extends Property {
	
	// Attributes (instance variables)
	private String Address;
	// Constructors
	public Building(String Object2, int Object3, int Object4, int Object1, String address) {
		super(Object1, Object2, Object3, Object4);
		Address = address;
	}
	// Behaviors (methods)
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
