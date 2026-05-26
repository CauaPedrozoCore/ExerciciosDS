import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Cadastro do Médico
        System.out.println("--- Iniciando Cadastro do Médico ---");
        System.out.print("---> Nome do Médico: ");
        String nomeM = in.nextLine();
        
        System.out.print("---> Idade do Médico: ");
        int iddM = in.nextInt();
        in.nextLine();
        
        System.out.print("---> CPF do Médico: ");
        String cpfM = in.nextLine();
        
        System.out.print("---> Telefone do Médico: ");
        String foneM = in.nextLine();
        
        System.out.print("---> Especialidade: ");
        String espM = in.nextLine();
        
        System.out.print("---> CRM do Médico: ");
        int crmM = in.nextInt();
        in.nextLine();
        
        Medico medico1 = new Medico(nomeM, iddM, cpfM, foneM, espM, crmM);
        System.out.println("Médico Cadastrado com sucesso!");
        
        // Cadastro do Paciente
        System.out.println("--- Iniciando Cadastro do Paciente ---");
        System.out.print("---> Nome do Paciente: ");
        String nomeP = in.nextLine();
        
        System.out.print("---> Idade do Paciente: ");
        int iddP = in.nextInt();
        in.nextLine();
        
        System.out.print("---> CPF do Paciente: ");
        String cpfP = in.nextLine();
        
        System.out.print("---> Telefone do Paciente: ");
        String foneP = in.nextLine();
        
        System.out.print("---> Tipo Sanguíneo: ");
        String sangue = in.nextLine();
        
        System.out.print("---> Logradouro: ");
        String logP = in.nextLine();
        
        Paciente paciente1 = new Paciente(nomeP, iddP, cpfP, foneP, sangue, logP);
        System.out.println("Paciente Cadastrado com sucesso!");

        // --- AGENDAMENTO (A CONTINUAÇÃO) ---
        System.out.println("--- Agendando Consulta ---");
        
        System.out.print("Data da consulta: ");
        String data = in.nextLine();
        
        System.out.print("Hora da consulta: ");
        String hora = in.nextLine();

        // Criando a consulta unindo o medico1 e o paciente1
        Consulta consulta1 = new Consulta(medico1, paciente1, data, hora);

        // Exibindo o resultado final
        System.out.println("--- Apresentando Agendamento ---");
        consulta1.exibirDadosConsulta();
        
        in.close();
    }
}