import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Cadastro do Médico
		System.out.println("----- Cadastro do Instrutor -----");
		System.out.println("---> 1. Nome do Instrutor: ");
		String nomeIn = in.nextLine();
		
		System.out.println("---> 2. Idade do Instrutor: ");
		int idadeIn = in.nextInt();
		in.nextLine(); 
		
		System.out.println("---> 3. CPF do Instrutor: ");
		String cpfIn = in.nextLine();
		
		System.out.println("---> 4. Telefone do Instrutor: ");
		String foneIn = in.nextLine();
		
		System.out.println("---> 5. Email do Instrutor: ");
		String emailIn = in.nextLine();
		
		System.out.println("---> 6. Qual Turno? ");
		String turnoIn = in.nextLine();
		
		System.out.println("---> 7. Qual a Especialidade? ");
		String espIn = in.nextLine();
		
		Instrutor instrutor1 = new Instrutor(nomeIn, idadeIn, cpfIn, foneIn, emailIn, turnoIn, espIn);
		
		System.out.println("--- Feito!! " +nomeIn+ " Cadastrado!! ---");
		
		System.out.println("----- Cadastro do Aluno -----");
		System.out.println("---> 1. Nome do Aluno: ");
		String nomeAl = in.nextLine();
		
		System.out.println("---> 2. Idade do Aluno: ");
		int idadeAl = in.nextInt();
		in.nextLine();
		
		System.out.println("---> 3. CPF do Aluno: ");
		String cpfAl = in.nextLine();
		
		System.out.println("---> 4. Telefone do Aluno: ");
		String foneAl = in.nextLine();
		
		System.out.println("---> 5. Email do Aluno: ");
		String emailAl = in.nextLine();
		
		System.out.println("---> 6. Ano de Nascimento? ");
		int anoNascAl = in.nextInt();
		
		System.out.println("---> 7. Peso do Aluno: ");
		double pesoAl = in.nextDouble();
		
		System.out.println("---> 8. Altura do Aluno: ");
		double alturaAl = in.nextDouble();
		in.nextLine(); 
		
		System.out.println("---> 9. Qual o Plano do Aluno? ");
		String planoMat = in.nextLine();
		
		System.out.println("---> 10. Qual o valor do plano? ");
		double valorMat = in.nextDouble();
		
		Aluno aluno1 = new Aluno(nomeAl, idadeAl, cpfAl, foneAl, emailAl, anoNascAl, pesoAl, alturaAl);
		
		Matricula mat = new Matricula(aluno1, instrutor1, planoMat, valorMat);

        mat.exibirMatricula();

        in.close();
		
	}

}
