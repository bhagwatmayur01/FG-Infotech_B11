package Functional_Interface;

@FunctionalInterface
 interface Sayble{
	 void say(String message);  //abstract method
	
	//default method in interface
	public default void hey() {
		System.out.println("hey method is calling");
	}
	public default void hey1() {
		System.out.println("hey1 method is calling");
	}
	
	static void sayHello() {
		System.out.println("Static method is calling sayHello");
	}
	
	static void sayHello1() {
		System.out.println("Static method is calling  sayHello1");
	} 
}
public class Demo implements Sayble{
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.say("hey");
		d1.hey();
		d1.hey1();
		Sayble.sayHello();
		Sayble.sayHello1();		
		
		}

	@Override
	public void say(String message) {
		System.out.println("Mayur");
		
	}

}
