package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	String city; 
	float marks;
	String message;
	Student(int id,String name, String city, float marks, String message )
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.marks=marks;
		this.message=message;		
	}
	
	
}
public class Demo {

	public static void main(String[] args) {
     
    List<Student>student = new ArrayList<Student>();

    student.add(new Student(1,"Akash","Nanded",81.43f, "welcome1"));
    student.add(new Student(2,"Mayur","Pune",91.43f, "welcome2"));
    student.add(new Student(3,"Vishal","Solapur",48.43f, "welcome3"));
    student.add(new Student(4,"Ganesh","Nagar",56.43f, "welcome4"));
    student.add(new Student(5,"Sachin","Sambhaji",71.43f, "welcome5"));

    List<Float>studentMarkList =new ArrayList<Float>();
    System.out.println("----Itetaring the data without using stream api---");
    for(Student stud:student) {
    	if(stud.marks>90) {
    	   	studentMarkList.add(stud.marks);
    	}
    	
    }
    System.out.println(studentMarkList);

    System.out.println("---we are learnig java8 stream API---");
    List<Float>studentMarkList1 = student.stream().filter(m->m.marks>90).map(m->m.marks).collect(Collectors.toList());
	 System.out.println(studentMarkList1);
	 ///student.stream().filter(null).map(null).collect(Collectors)
	}

}
