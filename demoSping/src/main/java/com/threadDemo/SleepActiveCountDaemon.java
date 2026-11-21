package com.threadDemo;

class Demo extends Thread{
	
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread is working.");
		} else {
			System.out.println("User Thread is working.");
		}

		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			System.out.println("Active threads"+Thread.activeCount());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
public class SleepActiveCountDaemon {

	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		//System.out.println("Run");
        //d1.run();
        //d2.run();
        System.out.println("Start");
        d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}
}
