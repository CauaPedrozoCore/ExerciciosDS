	public abstract class Pessoa {
		
		public String nome;
		private int idade;
		private String cpf;
		private String telefone;

		public Pessoa(String nome, int idade, String cpf, String telefone) {
		    this.nome = nome;
		    this.idade = idade;
		    this.cpf = cpf;
		    this.telefone = telefone;
		}

		public String getNome() {
			return nome;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public String getCpf() {
			return cpf;
		}
		
		public String getTelefone() {
			return telefone;
		}
		
	}