package Optional_Class;


public class Demo1 {

	public static void main(String[] args) {
		
	//Ex.To handle NullPointerException without using java8 Optional class
    
		String str="Ganesh";
		if(str==null) 
		{
			System.out.println("str variable ...thids is null");
		}
		else
		{
			System.out.println(str.length());
		}
	}

}
