public class Aluno extends Pessoa{

	public int anoNasc;
	private double peso, altura;
	private String plano;
	
	public Aluno(String nome, int idade, String cpf, String telefone, String email, int anoNasc, double peso, double altura) {
		super(nome, idade, cpf, telefone, email);
		this.anoNasc = anoNasc;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String verificarIdade() {
		int idade = 2026 - anoNasc;
		if (idade >= 18) {
			return("Maior de Idade"); }
		else {
			return("Menor de Idade");
		}
	}
	
	public String classificarImc() {
		double imc = this.peso / (this.altura * this.altura);;
		if (imc < 18.5) {
			return("Excesso de Magreza");
		}
		else if (imc < 25) {
			return("Peso Normal");
		}
		else if (imc < 30) {
			return("Sobrepeso");
		}
		else {
			return("Obesidade");
		}
	}
	
}
