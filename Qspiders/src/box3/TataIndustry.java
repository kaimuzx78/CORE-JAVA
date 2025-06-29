package box3;

class Nexon{
	String color;
	int price;
	double bCap;
	
	Nexon(String c, int p, double b) { //constructor
		System.out.println("Constructor Start");
		color=c;
		price=p;
		bCap=b;
		System.out.println("Constructor End");
	}
	void details() {
		System.out.println("Car Color is : "+color+ "Price is :"+price+"Battery Capacity is"+bCap);
	}
}

public class TataIndustry {
	public static void main(String[] args) {
		Nexon n1 = new Nexon("White", 25 , 5.4);
		n1.details();
		
		System.out.println("----------");
		Nexon n2 = new Nexon("black", 22 ,3.8);
		n2.details();
	}

}
