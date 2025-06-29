package box2;

public class Thar {
	String color;
	int price;
	int speed;
	double milage;
	
	void details() {
		System.out.println("Car color is"+color+"price is"+price+"speed is"+speed+"milage is"+milage);
	}
	
	public static void main(String[] args) {
		Thar t1 = new Thar();
		t1.color="red";
		t1.speed=720;
		t1.price=150;
		t1.milage=123.2;
		
		t1.details();
		
		Thar t2 = new Thar();
		t2.color="blue";
		t2.speed=120;
		t2.price=120;
		t2.milage=12.2;
		
		t2.details();
	}
}


