/**
 * 
 * @author Ahmet
 *
 */
public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescrption();

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public double cost() {
		return 0;
	}
}
