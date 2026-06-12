
public class CalcularISS implements Imposto {

	@Override
	public double cobrarImposto(double value) {
		return value = value / 100 * 10;
	}

}