package box4;

public class Doremon {
	String n;
	int age;
	
	public Doremon(String n, int age) {
		this.n = n;
		this.age = age;
	}
	
	{
		System.out.println("B inside non-static block");
		n="aadesh";
		age=21;
	}
	{
		System.out.println("C insde non-staic block 2");
		n="pooja";
		age=24;
	}


	public static void main(String[] args) {
	
	}

}
