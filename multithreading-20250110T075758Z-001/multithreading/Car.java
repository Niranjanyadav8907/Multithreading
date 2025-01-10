package multithreading;

public class Car extends Thread{
	
	public void run() {
		System.out.println("====run() starts====");
		drive();
		System.out.println("====run() ends====");
	}
	
	public void drive() {
		System.out.println("Drive starts");
		for(int i=1;i<=10;i++)
			System.out.println("Car completes "+i+"KM");
		System.out.println("Drive Ends");
	}

}
