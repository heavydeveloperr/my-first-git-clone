package misleneous;

import java.util.Objects;

public class HashCode {
	public static void main(String[] args) {
		

		Employee employee = new Employee("Janmejaya" , "123");
		Employee employee1 = new Employee("Janmejaya" , "123");
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		
		System.out.println(employee.equals(employee1));
	}
	

}



class Employee{
	
	private String name;
	
	private String id;
	
	public Employee(String name , String id ) {
		this.name= name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
