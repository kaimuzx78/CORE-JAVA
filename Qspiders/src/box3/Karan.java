package box3;
class Splendor{
	String color;
	int price;
	
	Splendor(String color, int price){
		this.color=color;
		this.price=price;
		System.out.println("This keyword : "+this);
	}
}
public class Karan {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Splendor s1= new Splendor("PINK",6000);
		System.out.println("S1 : "+s1);
		
		System.out.println("------------");

		Splendor s2= new Splendor("BLACK",8000);
		System.out.println("S2 : "+s2);
		
		System.out.println("------------");

		Splendor s3= new Splendor("Ornage",5000);
		System.out.println("S3 : "+s3);
		
		System.out.println("Main End");
	}

}
