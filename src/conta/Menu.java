package conta;

import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(1, 123, 1, "Julia", 10000.0f, 0);
		contaCorrente.visualizar();
		contaCorrente.sacar(12000.0f);
		contaCorrente.visualizar();
		contaCorrente.depositar(5000.0f);
		contaCorrente.visualizar();

		ContaPoupanca contaPoupanca = new ContaPoupanca(12, 1213, 1, "Vicente", 1000.0f, 43);
		contaPoupanca.visualizar();
		contaPoupanca.sacar(12000.0f);
		contaPoupanca.visualizar();
		contaPoupanca.depositar(5000.0f);
		contaPoupanca.visualizar();

		Scanner scanner = new Scanner(System.in);

		int opcao;

		while (true) {

			CorUtils.imprimirRoxo("*****************************************************",
					"                                                     ",
					"                Null Banks do Brazil                 ",
					"                                                     ",
					"*****************************************************",
					"                                                     ",
					"            1 - Criar Conta                          ",
					"            2 - Listar todas as Contas               ",
					"            3 - Buscar Conta por Numero              ",
					"            4 - Atualizar Dados da Conta             ",
					"            5 - Apagar Conta                         ",
					"            6 - Sacar                                ",
					"            7 - Depositar                            ",
					"            8 - Transferir valores entre Contas      ",
					"            9 - Sair                                 ",
					"                                                     ",
					"*****************************************************",
					"Entre com a opção desejada:                          ",
					"                                                     ");

			System.out.print(CorUtils.RESET);

			opcao = scanner.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println("Saque\n\n");
				break;
			case 7:
				System.out.println("Depósito\n\n");
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
			scanner.close();
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Julia Pinheiro - julia.pinheirooliveira222@gmail.com");
		System.out.println("github.com/JuliaPinheiro");
		System.out.println("*********************************************************");
	}

}
