package BankTura;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Lista de Clientes
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		// Lista de Funcionarios
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		// Lista de Conta Poupança
		ArrayList<ContaPoupanca> listaPoupanca = new ArrayList<ContaPoupanca>();
		// Lista de Conta Corrente
		ArrayList<ContaCorrente> listaCorrente = new ArrayList<ContaCorrente>();
		// Scanner para input de dados
		Scanner ler = new Scanner(System.in);
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		int opcao;
		int choice = 0;
		do {
			System.out.println("****** BankTura ******");
			System.out.println("Bem Vindo ao nosso banco \n "
					+ "Digite 1 para Cadastrar Cliente,\n"
					+ "        2 para Listar Cliente,\n"
					+ "        3 para Remover Cliente, \n"
					+ "        4 para Atualizar Cliente, \n"
					+ "        5 para Cadastrar Funcionário,\n"
					+ "        6 para Listar Funcionário,\n"
					+ "        7 para Criar Conta,\n"
					+ "        8 para Listar Conta,\n"
					+ "        9 para Depositar,\n" + ""
					+ "        10 para Sacar,\n"
					+ "        11 para Sair");
			opcao = ler.nextInt();
			ler.nextLine();

			switch (opcao) {
			case 1:
				cliente = new Cliente();
				System.out.println("******Cadastro de Cliente******");
				System.out.println("Digite o Nome: ");
				cliente.setNome(ler.nextLine());
				System.out.println("Digite o Email: ");
				cliente.setEmail(ler.nextLine());
				System.out.println("Digite o CPF: ");
				cliente.setCpf(ler.nextLine());
				System.out.println("Digite o Endereço: ");
				cliente.setEndereco(ler.nextLine());
				System.out.println("Digite o Telefone: ");
				cliente.setTelefone(ler.nextLine());
				System.out.println("O cliente é VIP? Digite Sim ou Não");
				String vip = ler.nextLine();
				if (vip.equalsIgnoreCase("Sim")) {
					cliente.setVip(true);
				} else {
					cliente.setVip(false);
				}
//				// Adiciona os dados a lista de clientes
				listaClientes.add(cliente);
				break;
			case 2:
				System.out.println("******Lista de Clientes******");
//				/*
//				 * System.out.println("Nome: " + cliente.getNome());
//				 * System.out.println("Email: " + cliente.getEmail());
//				 * System.out.println("CPF: " + cliente.getCpf());
//				 * System.out.println("Endereço: " + cliente.getEndereco());
//				 * System.out.println("Telefone: " + cliente.getTelefone());
//				 * if(cliente.isVip() == true){ System.out.println("Vip: Sim");
//				 * } else{ System.out.println("Vip: Não"); }
//				 */
//				// Pega a posição de memoria
////				 for (int i = 0; i < listaClientes.size(); i++) {
////				 System.out.println(listaClientes.get(i).getNome());
////				 }
				// Retorna os dados da lista
				for (Cliente clienteIndice : listaClientes) {
					System.out.println("Nome: " + clienteIndice.getNome());
					System.out.println("Email: " + clienteIndice.getEmail());
					System.out.println("CPF: " + clienteIndice.getCpf());
					System.out.println("Endereço: " + clienteIndice.getEndereco());
					System.out.println("Telefone: " + clienteIndice.getTelefone());
					if (clienteIndice.isVip() == true) {
						System.out.println("Vip: Sim");
					} else {
						System.out.println("Vip: Não");
					}
				}

				break;
			case 3:
				System.out.println("******Remoção de Cliente******");
				System.out.println("Digite o CPF do Cliente");
				String newCpf = ler.nextLine();
				for (int i = 0; i < listaClientes.size(); i++) {
					if (listaClientes.get(i).getCpf().equals(newCpf)) {
						listaClientes.remove(i);
						System.out.println("CPF CANCELADO!");
					} else {
						System.out.println("CPF Inválido!");
					}
				}
				break;
			case 4:
				System.out.println("******Alteração de Cliente******");
				System.out.println("Digite o cpf: ");
				String editCpf = ler.nextLine();
				for (int i = 0; i < listaClientes.size(); i++) {
					if (listaClientes.get(i).getCpf().equals(editCpf)) {
						
						System.out.println("Digite 1 para alterar nome\n,"
								+ "		Digite 2 pra endereço,\n"
								+ "		Digite 3 para email,\n"
								+ "		Digite 4 para telefone,\n"
								+ "		Digite 5 para vip\n");
						int anotherOption = ler.nextInt();
						switch(anotherOption){
						case 1:
							System.out.println("Nome:" + listaClientes.get(i).getNome());
							System.out.println("Digite o novo nome: ");
							listaClientes.get(i).setNome(ler.nextLine());
							break;
						case 2:
							System.out.println("Endereço: " + listaClientes.get(i).getEndereco());
							System.out.println("Digite o novo endereço: ");
							listaClientes.get(i).setEmail(ler.nextLine());
							break;
						case 3:
							System.out.println("Email: " + listaClientes.get(i).getEmail());
							System.out.println("Digite o novo email: ");
							listaClientes.get(i).setEndereco(ler.nextLine());
							break;
						case 4:
							System.out.println("Telefone: " + listaClientes.get(i).getTelefone());
							System.out.println("Digite o novo telefone: ");
							listaClientes.get(i).setTelefone(ler.nextLine());
							break;
						case 5:
							if (listaClientes.get(i).isVip() == true) {
								System.out.println("Vip: Sim");
							} else {
								System.out.println("Vip: Não");
							}
							System.out.println("Digite Sim ou Não para o novo status vip");
							String editVip = ler.nextLine();
							if(editVip.equalsIgnoreCase("Sim")){
								listaClientes.get(i).setVip(true);
							}
							else{
								listaClientes.get(i).setVip(false);
							}
							break;
						case 6:
							System.out.println("Endereço: " + listaClientes.get(i).getEndereco());
							System.out.println("Digite o novo Nome: ");
							listaClientes.get(i).setNome(ler.nextLine());
							System.out.println("Digite o novo endereço: ");
							listaClientes.get(i).setEndereco(ler.nextLine());
							System.out.println("Digite o novo Telefone: ");
							listaClientes.get(i).setTelefone(ler.nextLine());
							System.out.println("Digite o novo Email: ");
							listaClientes.get(i).setEndereco(ler.nextLine());
							System.out.println("Digite o novo Vip: ");
							listaClientes.get(i).setEndereco(ler.nextLine());
							break;
						default:
							System.out.println("Opção Inválida");
							break;
						}
					} 
				}
				break;
			case 5:
				funcionario = new Funcionario();
				System.out.println("******Cadastro de Funcionário******");
				System.out.println("Digite o Nome: ");
				funcionario.setNome(ler.nextLine());
				System.out.println("Digite o Email: ");
				funcionario.setEmail(ler.nextLine());
				System.out.println("Digite o CPF: ");
				funcionario.setCpf(ler.nextLine());
				System.out.println("Digite o Endereço: ");
				funcionario.setEndereco(ler.nextLine());
				System.out.println("Digite o Telefone: ");
				funcionario.setTelefone(ler.nextLine());
				System.out.println("Digite o Salário do Funcionário: ");
				funcionario.setSalario(ler.nextDouble());
				// Lista de funcionarios
				listaFuncionarios.add(funcionario);
				break;
			case 6:
				System.out.println("******Lista de Funcionários******");
				for (Funcionario funcionarioIndice : listaFuncionarios) {
					System.out.println("Nome: " + funcionarioIndice.getNome());
					System.out.println("Email: " + funcionarioIndice.getEmail());
					System.out.println("CPF: " + funcionarioIndice.getCpf());
					System.out.println("Endereço: " + funcionarioIndice.getEndereco());
					System.out.println("Telefone: " + funcionarioIndice.getTelefone());
					System.out.println("Salário: R$ " + funcionarioIndice.getSalario());
				}
				
				break;
			case 7:
				poupanca = new ContaPoupanca();
				corrente = new ContaCorrente();
				System.out.println("******Criação de Conta******");
				System.out.println("Digite o tipo da conta, Poupança ou Corrente");
				String tipoConta = ler.nextLine();
				if (tipoConta.equalsIgnoreCase("Poupança")) {
					System.out.println("******Poupança******");
					System.out.println("Digite o Limite da conta: ");
					poupanca.setLimite(ler.nextDouble());
					System.out.println("Digite o Saldo da conta: ");
					poupanca.setSaldo(ler.nextDouble());
					System.out.println("Digite o numero da conta: ");
					poupanca.setNumero(ler.nextInt());
					// Lista de poupanças
					listaPoupanca.add(poupanca);
				} else {
					System.out.println("******Corrente******");
					System.out.println("Digite o Limite da conta: ");
					corrente.setLimite(ler.nextDouble());
					System.out.println("Digite o Saldo da conta: ");
					corrente.setSaldo(ler.nextDouble());
					System.out.println("Digit o Número da conta: ");
					corrente.setNumero(ler.nextInt());
					// Lista de contas correntes
					listaCorrente.add(corrente);
				}
				break;
			case 8:
				System.out.println("******Lista de Contas******");
				System.out.println("Digite o tipo de conta que deseja listar: ");
				String tipoEscolha = ler.nextLine();
				if (tipoEscolha.equalsIgnoreCase("Poupança")) {
					System.out.println("******Poupança******");
					for (ContaPoupanca poupancaIndice : listaPoupanca) {
						System.out.println("Número: " + poupancaIndice.getNumero());
						System.out.println("Limite: " + poupancaIndice.getLimite());
						System.out.println("Saldo: " + poupancaIndice.getSaldo());
					}
				} else {
					System.out.println("******Corrente******");
					for (ContaCorrente correnteIndice : listaCorrente) {
						System.out.println("Número: " + correnteIndice.getNumero());
						System.out.println("Limite: " + correnteIndice.getLimite());
						System.out.println("Saldo: " + correnteIndice.getSaldo());	
					}
				}
				break;
			case 9:
				System.out.println("Digite o tipo da sua conta: ");
				String tipoEscolheConta = ler.nextLine();				
				if (tipoEscolheConta.equalsIgnoreCase("Poupança")) {
					System.out.println("Insira o número da sua conta: ");
					int numeroConta = ler.nextInt();
					System.out.println("Insira o valor a ser depositado: ");
					double valor = ler.nextDouble();
					for (int i = 0; i < listaPoupanca.size(); i++) {
						if(numeroConta == listaPoupanca.get(i).getNumero()){
							listaPoupanca.get(i).depositar(tipoEscolheConta, valor, poupanca.getJuros());
						}
						else{
							i = listaPoupanca.size() + 1;
							System.out.println("Número inválido");
						}
					}	
				} else {
					System.out.println("Insira o valor a ser depositado: ");
					double valor = ler.nextDouble();
					corrente.depositar(tipoEscolheConta, valor, corrente.getTaxa());
				}
				break;
			case 10:
				System.out.println("Digite o tipo da sua conta: ");
				String tipoEscolhaContas = ler.nextLine();				
				if (tipoEscolhaContas.equalsIgnoreCase("Poupança")) {
					System.out.println("Insira o número da sua conta: ");
					int numeroConta = ler.nextInt();
					System.out.println("Insira o valor a ser sacado: ");
					double valor = ler.nextDouble();
					for (int i = 0; i < listaPoupanca.size(); i++) {
						if(numeroConta == listaPoupanca.get(i).getNumero()){
							listaPoupanca.get(i).sacar(tipoEscolhaContas, valor, poupanca.getJuros());
						}
						else{
							i = listaPoupanca.size() + 1;
							System.out.println("Número inválido");
						}
					}	
				} else {
					System.out.println("Insira o valor a ser depositado: ");
					double valor = ler.nextDouble();
					corrente.depositar(tipoEscolhaContas, valor, corrente.getTaxa());
				}
				break;
			case 11:
				choice = 2;
				break;
			default:
				System.out.println("Opção Inválida, " + "por favor digite uma opção válida");
				break;
			}
			if (opcao != 11) {
				System.out.println("Fazer outra operação?\n1- sim\n2-não");
				choice = ler.nextInt();
			} else {
				System.out.println("Volte sempre!");
			}
		} while (choice == 1);
	}

}
