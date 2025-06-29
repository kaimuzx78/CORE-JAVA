package box2;

public class Tazakhabar {
	static int a = 545; // non static global variable
			int  b= 786;
	public static void main(String[] args) {
		int a = 50; // local variable
		int b = 40; // local variable
		
		System.out.println(a);
		System.out.println(b);
		
		//local variable are given 1st preference
		System.out.println("-----------");
		System.out.println(Tazakhabar.a);
		System.out.println(new Tazakhabar().b);
		
	}
}
