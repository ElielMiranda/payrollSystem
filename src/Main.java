import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	
	//Limpar a tela do terminal e reimprimir as opções.
	public static void options() {
		
		System.out.println("Informe a operação que deseja realizar no momento.");
		
		System.out.println("[0] Sair do Sistema\n[1] Adicionar funcionário\n[2] Remover funcionário\n[3] Lançar um cartão de ponto\n[4] Lançar um resultado da venda\n[5] Lançar uma taxa de serviço\n"
				+ "[6] Alterar detalhes de um funcionário\n[7] Rodar folha de pagamento do dia\n[8] Undo/Redo\n[9] Agenda de pagamento\n[10] Criar novas agendas de pagamentos\n");
		
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner input = new Scanner(System.in);
		
		Functions functions = new Functions();
		List<Employee> employees = new ArrayList<Employee>();
		
		int option;
  
		while(true) {
			
			options();
			
			option = input.nextInt();
			
			if(option == 0) {
				System.out.println("Obrigado!");
				break;
			}
			
			switch(option) {
				
			case 1: 
				System.out.println("\nAdicionar um funcionário\n");
				
				employees.add(addEmp(employees));
				employees.add(functions.addEmp(employees));
				System.out.println("Usuário\n" + employees.get(1).toString() + "criado com sucesso");
				break;
						
			case 2:
				System.out.println("\nRemoção de um funcionário\n");
				//payrollSystem.deleteEmployee();
				break;
			
			case 3:
				System.out.println("\nLançar um cartão de ponto\n");
				//payrollSystem.launchTimecard();
				break;
			case 4:
				System.out.println("\nFunção lançar um resultado da venda\n");
			default:
				System.out.println("Operação INCORRETA, digite uma opção válida.");
				break;	

			}
			
			System.out.println("Deseja realizar outra operação?\n" + "Digite 1 ou digite 0 para sair");
			option = input.nextInt();
			if(option == 1) {
				continue;
			}
			else if(option == 0) {
				System.out.println("Obrigado!");
				break;
			}
			
			
		
		input.close();
		
		}
	}	
}
