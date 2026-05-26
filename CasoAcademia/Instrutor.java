public class Instrutor extends Pessoa{
	
	private String turno;
	private String especialidade;
	
	public Instrutor(String nome, int idade, String cpf, String telefone, String email, String turno, String especialidade) {
		super(nome, idade, cpf, telefone, email);
		this.turno = turno;
		this.especialidade = especialidade;
	}
	
	public String getTurno() {
		return turno;
	} 	
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
