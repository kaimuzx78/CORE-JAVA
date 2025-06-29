package box3;

class Optimus{
	String color;
	int price;
	double bCap;
	
	Optimus(String color, int price, double bCap){ //constructor
		System.out.println("constructor START");
		this.color=color;
		this.price=price;
		this.bCap=bCap;
		System.out.println("constructor END");
	}
	void info() {
		System.out.println("ROBO COLOR IS:"+color+"Price is:"+price+"bCap is"+bCap);
	}
}

public class Tesla {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		Optimus p1 = new Optimus("red", 25 ,6.5);
		p1.info();
		System.out.println("MAIN END");
	}

}
