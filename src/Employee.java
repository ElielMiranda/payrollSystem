
public class Employee {
	private static int quantCreate;
	private int id;
	private String name;
	private String address;
	private int typeEmp; //Os tipos serão 1-hourly, 2-salaried, 3-commissioned
	
	
	public Employee(String name, String address, int typeEmp){
		quantCreate++;
		this.setName(name);
		this.setAddress(address);
		this.setTypeEmp(typeEmp);
		setId(Employee.quantCreate + 1);
	}
	
	
	
	//Gets e Sets
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTypeEmp() {
		return typeEmp;
	}
	public void setTypeEmp(int typeEmp) {
		this.typeEmp = typeEmp;
	}
	
	
	
	@Override
	public String toString() {
		return "ID: " + getId() + "\n" + "Nome: " + getName() + "\n" 
				+ "Tipo: " + getTypeEmp() + "\n" + "ID sindicato: " + "\n";
	}
    
	
}


