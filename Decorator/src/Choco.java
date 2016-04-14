/**
 * Choco
 * @author Oezsoy Ahmet
 * @version 14.04.2016
 */
public class Choco extends CondimentDecorator {
	private Beverage beverage;

	/**
	 * 
	 */
	public Choco(Beverage beverage) {
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
		return 0.25 + beverage.cost();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}