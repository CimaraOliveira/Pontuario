package pontuarios;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int opcao = 0;

        MainUI ui = new MainUI();

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medico = new ArrayList<>();
        List<Prontuario> prontuario = new ArrayList<>();

        Prontuario pr = new Prontuario();
        Prontuario pr1 = new Prontuario();
        Prontuario pr2 = new Prontuario();

        Medico m1 = new Medico();
        m1.setNome("Cimarinha");
        m1.setCrm(222);
        Medico m2 = new Medico();
        m2.setNome("gui");
        m2.setCrm(444);

        Consulta consulta = new Consulta();
        consulta.setSintoma("dor de cabeca");
        consulta.setMedico(m1);
        consulta.setDiagnostico("trabalhou demais");

        Consulta consulta1 = new Consulta();
        consulta1.setSintoma("dor de barriga");
        consulta1.setMedico(m1);
        consulta1.setDiagnostico("comeu demais");

        pr.getConsultas().add(consulta);
        pr.getConsultas().add(consulta1);

        pr1.getConsultas().add(consulta);
        pr1.getConsultas().add(consulta1);

        pr2.getConsultas().add(consulta);
        pr2.getConsultas().add(consulta1);

        Paciente p1 = new Paciente();
        p1.setCpf("111111");
        p1.setNome("daniel");
        p1.setProntuario(pr);

        Paciente p2 = new Paciente();
        p2.setCpf("222222");
        p2.setNome("joao");
        p2.setProntuario(pr1);

        Paciente p3 = new Paciente();
        p2.setCpf("3333");
        p2.setNome("Hugo");
        p2.setProntuario(pr2);

        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);

        medico.add(m1);
        medico.add(m2);

        boolean continuar = true;
        while (continuar) {
            System.out.println("--------------------------");
            System.out.println("1-Buscar Pontuário");
            System.out.println("2-Listar Médico");
            System.out.println("3-Listar Pacientes");
            System.out.println("4-Sair");
            System.out.println("--------------------------");

            System.out.println(" Enscolha sua opcao: ");
            opcao = Input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira o Número do Cpf que Deseja Buscar");
                    String cpf = Input.next();

                    for (Paciente p : pacientes) {
                        if (p.getCpf().equals(cpf)) {
                            System.out.println("---------------------------");
                            System.out.println("nome: " + p.getNome());
                            System.out.println("paciente: " + p.getCpf());
                            System.out.println("-----prontuario------------");

                            if (!p.getProntuario().getConsultas().isEmpty()) {
                                for (Consulta c : p.getProntuario().getConsultas()) {
                                    System.out.println("Medico: " + c.getMedico().getNome());
                                    System.out.println("Sintomas: " + c.getSintoma());
                                    System.out.println("Diagnostico: " + c.getDiagnostico());
                                    System.out.println("           -----");
                                }
                            }
                            break;
                        }
                    }
                    continuar = false;
                    break;

                case 2:
                    for (Medico m : medico) {
                        System.out.println("-----------------------");
                        System.out.println("Medico:" + m.getNome());
                        System.out.println("Crm: " + m.getCrm());
                        System.out.println("-----------------------");
                    }
                    break;
                case 3:
                    for (Paciente p : pacientes) {
                        System.out.println("-----------------------");
                        System.out.println("Medico:" + p.getNome());
                        System.out.println("Crm: " + p.getCpf());
                        System.out.println("-----------------------");
                    }

                    break;
                case 4:

                    break;

                default:
                    System.out.println("Opçao Inválida");

            }
        }
    }
}
