package abstraction;

public interface InterFaceExample {
	
//	by default any parameter tat is declared  it is public staric final
	
	public  static final String name = "Interface";
	
	private static void staticMetod() {
		
	}
	
	public static void publicStaticMethod() {
		
		
		
	}
	
//	the default method can only be public 
	public default void doStuff() {
		System.out.println("doing Stuff");

	}
	

}
