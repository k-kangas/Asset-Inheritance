/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Asset Inheritance - Practice with Inheritance
 */

public class Art extends Property{
	
	// Attributes (instance variables)
	private String Name;
	private int Year;
	// Constructors
	public Art(String Object1, int Object3, int Object4, int Object2, String aName, int aYear) {
		super(Object2, Object1, Object3, Object2);
		Name = aName;
		Year = aYear;
	}
	// Behaviors (methods)

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	
}
