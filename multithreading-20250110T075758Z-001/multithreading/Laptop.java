package multithreading;

public class Laptop implements Runnable{
	String name;
	Laptop(){
		
	}
	Laptop(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println("Run method is implemented");
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("name is: "+name);
		System.out.println("Thread ID is: "+Thread.currentThread().getId());
		System.out.println("Thread Priority is: "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName()+" Priority is==>"+Thread.currentThread().getPriority());
	}
	
	
	

}
