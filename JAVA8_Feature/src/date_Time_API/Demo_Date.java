package date_Time_API;

import java.util.Date;

public class Demo_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date=new Date();
		System.out.println(date);
		
		long millis=System.currentTimeMillis();
		
		Date date1=new Date(millis);
		System.out.println(date1);
	}

}
