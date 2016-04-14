/**
 * Beverage
 * @author Oezsoy Ahmet
 * @version 14.04.2015
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}
