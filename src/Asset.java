/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Asset Inheritance - Practice with Inheritance
 */

public class Asset{

	// Attributes (instance variables)
	private String Name;
	private int Cost;
	private int Year;
	// Constructors
	public Asset(String aName, int aCost, int aYear) {
		//Object o = new Asset(aName, aCost, aYear);
		Name = aName;
		Cost = aCost;
		Year = aYear;
	}
	// Behaviors (methods)
		// Getters
	public String getName() {
		return Name;
	}
	public int getCost() {
		return Cost;
	}
	public int getYear() {
		return Year;
	}
		// Setters
	public void setName(String aName) {
		Name = aName;
	}
	public void setCost(int aCost) {
		Cost = aCost;
	}
	public void setYear(int aYear) {
		Year = aYear;
	}
	public double amortizedCost(int currentYear)
	{
	//return Cost / (Year - currentYear);
	return Cost / (currentYear - Year);
	}
	public int computeValue() {
		return Cost;
	}
	

}
