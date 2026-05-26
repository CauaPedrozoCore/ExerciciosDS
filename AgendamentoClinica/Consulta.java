public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String data;
    private String hora;

    public Consulta(Medico medico, Paciente paciente, String data, String hora) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
    }

    public void exibirDadosConsulta() {
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome() + " | CRM: " + medico.getCRM());
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Data & Hora: " + data + " às " + hora);
    }
}