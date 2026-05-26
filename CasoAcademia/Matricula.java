public class Matricula {
    private Aluno aluno;
    private Instrutor instrutor;
    private String plano;
    private double valorMensalidade;

    public Matricula(Aluno aluno, Instrutor instrutor, String plano, double valor) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.plano = plano;
        this.valorMensalidade = valor;
    }

    // Método para exibir a porcaria da matricula
    public void exibirMatricula() {
        System.out.println(" -----> Exibição de Matrícula <----- ");

        System.out.println("---> Aluno: " + aluno.getNome());
        System.out.println("---> Idade: " + aluno.getIdade() + " Anos");
        System.out.println("---> Status: " + aluno.verificarIdade());
        System.out.println("---> Telefone: " + aluno.getTelefone());
        System.out.println("---> IMC: " + aluno.classificarImc());
        System.out.println("----------------------------------------");
        System.out.println("---> Instrutor Responsável: " + instrutor.getNome());
        System.out.println("---> Especialidade: " + instrutor.getEspecialidade());
        System.out.println("---> Turno de Trabalho: " + instrutor.getTurno());
        System.out.println("---> Telefone do " + instrutor.getNome() + " :" + instrutor.getTelefone());
        System.out.println("----------------------------------------");
        System.out.println("---> Plano: " + this.plano);
        System.out.println("---> Valor: R$ " + this.valorMensalidade);
        System.out.println(" -----> Matrícula Finalizada... <-----");
    }
}