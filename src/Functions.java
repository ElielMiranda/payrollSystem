import java.util.List;
import java.util.Scanner;

public class Functions {

	public Employee addEmp(List<Employee> employees) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		scanner.close();
		
		while(true) {
			System.out.println("Digite o tipo do funcionário a ser cadastrado.\n"
					+ "[1] - Hourly\n[2] - Salaried\n [3] - Commissioned\n");
			
			int type = scanner.nextInt();
			
			System.out.println("Digite o NOME do Funcionário:");
			
			String name = scanner.nextLine();
			
			System.out.println("Digite o ENDEREÇO do Funcionário:");
			
			String address = scanner.nextLine();
			
			switch (type) {
				case 1: {
					Hourly employee = new Hourly(name, address, 1);
					return employee;
				}
				case 2:{
					Salaried employee = new Salaried(name, address, 2);
					return employee;
				}
				case 3: {
					Commissioned employee = new Commissioned(name, address, 3);
					return employee;
				}
				default:{
					System.out.println("Tipo inválido, digite novamente");
				}
			}
		}
	}
		
}
