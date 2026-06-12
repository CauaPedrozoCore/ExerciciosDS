
public class CalcularICMS implements Imposto{
	
	@Override
	public double cobrarImposto(double value) {
		return value = value / 100 * 18;
	}
	
}