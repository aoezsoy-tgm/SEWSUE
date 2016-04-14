/**
 * Mocha
 * @author Oezsoy Ahmet
 * @version 14.04.2016
 */
public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	/**
	 * 
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Schoko";
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}