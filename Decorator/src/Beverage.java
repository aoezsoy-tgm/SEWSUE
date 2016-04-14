/**
 * Beverage
 * @author Oezsoy Ahmet
 * @version 14.04.2016
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";
	/**
	 * @param args
	 */
	public abstract double cost();
	
	public String getDescription(){
		return description;
	}

}