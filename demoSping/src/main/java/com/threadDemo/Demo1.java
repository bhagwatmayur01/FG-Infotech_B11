package com.threadDemo;


public class Demo1 extends Thread{

	    public void run() {
	    	
	    	System.out.println("Proirirty");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo1 class has been started..");

		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		Demo1 d3=new Demo1();
		
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());
		System.out.println(d3.getPriority());
		
		d1.setPriority(MAX_PRIORITY);
		d2.setPriority(NORM_PRIORITY);
		d3.setPriority(MIN_PRIORITY);
		
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());
		System.out.println(d3.getPriority());
		
		d1.setPriority(2);
		d2.setPriority(7);
		d3.setPriority(6);
		
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());
		System.out.println(d3.getPriority());
	}

}
