package multithreading;
public class Driver1 {
	public static void main(String[] args) {
		Bus b1=new Bus();
		Bus b2=new Bus();
		Bus b3=new Bus();
		
		Thread t1=new Thread(b1);//Thread-1
		Thread t2=new Thread(b2);//Thread-2
		Thread t3=new Thread(b3);//Thread-3
		
		t1.start();//Thread-1 starts
		t2.start();//Thread-2 starts
		t3.start();//Thread-3 starts
		
		
	}

}
