/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Asset Inheritance - Practice with Inheritance
 */

public class Property extends Asset {
	
	// Attributes (instance variables)
	private int Value;
	// Constructors
	public Property(int pValue, String Object1, int Object2, int Object3) {
		super(Object1, Object2, Object3);
		Value = pValue;
	}
	// Behaviors (methods)
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	@Override
	public int computeValue() {
		return Value;
	}
}
