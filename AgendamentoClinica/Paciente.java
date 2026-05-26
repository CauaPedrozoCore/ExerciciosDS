public class Paciente extends Pessoa{

	private String tipoSanguineo;
	private String logradouro;
	
	public Paciente(String nome, int idade, String cpf, String telefone, String tipoSanguineo, String logradouro) {
		super(nome, idade, cpf, telefone);
		this.tipoSanguineo = tipoSanguineo;
		this.logradouro = logradouro;
	}
	
	public String getSangue() {
		return tipoSanguineo;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setSangue(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
}
