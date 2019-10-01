package pontuarios;

import java.util.Scanner;

public class MainUI {

    public void cadastros() {
        Scanner Input = new Scanner(System.in);
        int opcao = 0;

        do {
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

                    break;

                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opçao Inválida");

            }
        } while (opcao != 4);

    }
}


