package box3;

class RollRoyals{
	String color;
	int price;
	int speed;
	double hp;
	
	void detials() {
		System.out.println("Car Color is :"+color
				+"\ncar price is :"+price+"\nCar speed is:"+speed+
				"\nhouse power is: "+hp);
	}
	
	RollRoyals(String c, int inr, int raftar, double hoursep){
		color=c;
		price=inr;
		speed=raftar;
		hp=hoursep;
		
	}
}
public class Dubai {

	public static void main(String[] args) {
		//object yaha se create krunga
		System.out.println("-----------R1 Object Detials--------");
		RollRoyals r1 = new RollRoyals("Red", 50 ,80, 500.00);
		r1.detials();
		System.out.println("-----------R2 Object Detials--------");
		
		//dusra object
		RollRoyals r2 = new RollRoyals("magenta", 54, 150, 501.5);
		r2.detials();
	}

}
