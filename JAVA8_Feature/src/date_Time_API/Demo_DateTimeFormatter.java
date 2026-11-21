package date_Time_API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo_DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.now();
		System.out.println("Current Date: "+date);
		
		//"dd/MM/yyyy"
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String date1=date.format(formatter);
		System.out.println(date1);
		
		
		
			}

}
