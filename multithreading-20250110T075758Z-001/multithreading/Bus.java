package multithreading;

public class Bus extends Vehicle implements Runnable{
	@Override
	public void run() {
		startVehicle();
		drive();
	}
	public void drive() {
		System.out.println("Drive starts");
		for(int i=1;i<=10;i++)
			System.out.println("Bus completes "+i+"KM");
		System.out.println("Drive Ends");
	}

}
