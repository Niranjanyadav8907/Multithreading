package multithreading;
public class LaptopDriver {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Laptop l1=new Laptop("Dell");
		Laptop l2=new Laptop("HP");
		Laptop l3=new Laptop("Lenovo");
		/*Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		Laptop l3=new Laptop();*/
		
		Thread t1=new Thread(l1);
		Thread t2=new Thread(l2);
		Thread t3=new Thread(l3);
		
		t1.setName("DELL");
		t2.setName("HP");
		t3.setName("Lenovo");
		
		t1.setPriority(8);
		t2.setPriority(2);
		t3.setPriority(6);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
