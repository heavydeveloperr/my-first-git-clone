package coreJava.objectCloning;

public class Clonning {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("janmejaya" , 23);
		System.out.println(e1.hashCode());
		Employee e2 = (Employee)e1.clone();	
		System.out.println(e2.hashCode());
		
		
		System.out.println(e2.getName());
		e2.setName("Abdul");
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		
		System.out.println("==================================================================================");
		String[] stringArray = new String[3];
		stringArray[0] = "1";
		stringArray[1] = "2";
		stringArray[2] = "3";
		for(String num : stringArray) {
		System.out.println(num);
		}
		
		String[] coppyArray = stringArray.clone();
		stringArray[1] ="janmejaya";
		for(String num : coppyArray) {
			System.out.println(num);
			}
	}

}


	// to be able to clone we need to implement the clonable interface , it is a marker interface , just to tell jvm that we can perform cloning operation
class Employee implements Cloneable{
	
	private String name ;
	
	private int age ;
	
	public Employee(String name , int age ) {
		this.name = name ;
		this.age = age ; 
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj =  super.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("unable to clone afetrall , throws clonenotsupported exception");
		}
		return obj;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name= name;
				}
	
	
}
