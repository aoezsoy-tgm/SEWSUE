/**
 * Milk
 * @author Oezsoy Ahmet
 * @version 14.04.2016
 */
public class Milk extends CondimentDecorator {
	private Beverage beverage;

	/**
	 * 
	 */
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milch";
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public double cost() {
		return 0.40 + beverage.cost();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}