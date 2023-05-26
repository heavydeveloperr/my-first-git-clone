package coreJava.generics;

import java.util.Objects;

public class DailySollution {
	public static void main(String[] args) {
		Employee e1 = new Employee("gudu" , 23);
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee("gudu" , 29);
		
		System.out.println(e1.equals(e2));
		
		
	}
	
	
	
	


}



/*
 * class Employee {
 * 
 * private String id ;
 * 
 * private int age;
 * 
 * public Employee(String id , int age ) { this.id = id ; this.age = age ; }
 * 
 * @Override public int hashCode() { return Objects.hash(age, id); }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Employee other = (Employee) obj; return age == other.age &&
 * Objects.equals(id, other.id); }
 * 
 * 
 * }
 */


