package box2;

public class Lambo {
	String color;
	int price;
	int milage;
	
	void ride() {
		System.out.println("Ride....");
	}

	public static void main(String[] args) {
		Lambo L1 = new Lambo();
		System.out.println("Address of L1"+ L1);
		
		Lambo L2 = new Lambo();
		System.out.println("Address of L2"+ L2);
		
		Lambo L3 = new Lambo();
		System.out.println("Address of L3"+ L3);
		
		System.out.println("-------Object Call------");
		System.out.println(L1.color);
		System.out.println(L2.price);
		System.out.println(L3.milage);
	}

}
