import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		// Criando Instancias
		Imposto icms = new CalcularICMS();
		Imposto ipi = new CalcularIPI();
		Imposto iss = new CalcularISS();
		
		double valueIcms = 0, valueIss = 0, valueIpi = 0;
		
		// Laço do Menu
		for(int i = 0; i < 1;) {
		
		// Entradas de dados
		double value = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Total:"));
		JOptionPane.showMessageDialog(null, "Valor Sem Impostos: " + value);
			
		// Menu
		 int n = Integer.parseInt(JOptionPane.showInputDialog("---> Menu Impostos <---" +
				"\n---> 1. Calcular ICMS! "+
				"\n---> 2. Calcular ISS! " +
				"\n---> 3. Calcular IPI! " +
				"\n---> 4. Encerrar Programa? "
			));
		
		switch(n) {
		case 1: 
			valueIcms = icms.cobrarImposto(value);
			
			JOptionPane.showMessageDialog(null, "Você selecionou Cobrar ICMS");
			
			JOptionPane.showMessageDialog(null, "---> Nota Fiscal <---" +
					"\n---> Valor Inicial: " + value +
					"\n---> Valor do ICMS: " + valueIcms +
					"\n---> Valor Total: " + (value + valueIcms) +
					"\n :D "
					
				);
			
		break;
		
		case 2:
			valueIss = iss.cobrarImposto(value);
			
			JOptionPane.showMessageDialog(null, "Você selecionou Cobrar ISS");
			
			JOptionPane.showMessageDialog(null, "---> Nota Fiscal <---" +
					"\n---> Valor Inicial: " + value +
					"\n---> Valor do ICMS: " + valueIss +
					"\n---> Valor Total: " + (value + valueIss) +
					"\n :D "
				);
			
		break;
		
		case 3:
			valueIpi = ipi.cobrarImposto(value);
			
			JOptionPane.showMessageDialog(null, "Você selecionou Cobrar ISS");
			
			JOptionPane.showMessageDialog(null, "---> Nota Fiscal <---" +
					"\n---> Valor Inicial: " + value +
					"\n---> Valor do ICMS: " + valueIpi +
					"\n---> Valor Total: " + (value + valueIpi) +
					"\n :D "
				);
		break;
		
		case 4:
			System.out.println("---> Você selecionou a Opção 4...");
			System.out.println("---> Saindo...");
			JOptionPane.showMessageDialog(null, "Saindo...");
			i = 10;
		break;
		}
	}
	
	}

}
