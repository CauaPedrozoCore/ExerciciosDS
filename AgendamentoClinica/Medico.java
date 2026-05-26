public class Medico extends Pessoa{
	
	private String especialidade;
	private int crm;

	public Medico(String nome, int idade, String cpf, String telefone, String especialidade, int crm) {
		super(nome, idade, cpf, telefone);
		this.especialidade = especialidade;
		this.crm = crm;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
		
	public int getCRM() {
		return crm;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setCRM(int crm) {
		this.crm = crm;
	}
	
}
