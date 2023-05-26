package coreJava.generics;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Main {
	
	public static void main(String[] args) throws ParseException {
	Employee employee1 = new Employee("abdul" , 23	);
	Employee employee2 = new Employee("janmejaya" , 23	);
	
	
	GenericClass<Employee> gen = new GenericClass<>(employee1, 1);
	
	System.out.println(gen.getData().getClass().getSimpleName());
	
	
	   SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	   Date date = new Date();
	   String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	}

}
class GenericClass<T>{
	
	private T data;
	
	private int id;
	
	public GenericClass(T data, int id) {
		super();
		this.data = data;
		this.id = id;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

class Employee {
	
	private String name ;
	
	
	private int age ;
	
	public  Employee(String name , int age ) {
	this.name= name;
	this.age=age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
	
	
	
}
