import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class TesteAdicaoEmpregado {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee = new Hourly("Eliel", "Marechal Deodoro", 2);
				
		Employee employee2 = new Salaried("Eliel", "Marechal Deodoro", 2);
		
		Employee employee3 = new Commissioned("João", "Maceió", 2);
		
		
		int id = employee.getId();
		int id2 = employee2.getId();
		
		System.out.println("id1= " + id + " id2= " + id2);
		
		System.out.println(employee.toString());
		System.out.println(employee2.toString());
		
		System.out.println(employee3.toString());
		
//	
//		employees.add(1, employee);
//		
//		employees.add(2, employee2);
//
//		System.out.println(employees.indexOf(employee2));
//		
////		for (Employee empregado : employees) {
//
//			System.out.println(employee.toString());
//		}

	}

}
