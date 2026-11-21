package Optional_Class;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
	   System.out.println("We are learning java8 Optinal class features:");
       String str=null;
       Optional<String>optinal=Optional.ofNullable(str);
       System.out.println(optinal.isPresent());
       
     //  System.out.println(optinal.get());
       
       System.out.println(optinal.orElse("No value present in str object"));

 
       Optional<String>name=Optional.of("Mayur");
       System.out.println("Name: "+name.get());
       
       name.ifPresent(n->System.out.println(n));
       
       
	}

}
