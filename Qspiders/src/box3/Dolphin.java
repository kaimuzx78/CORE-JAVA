package box3;

class Octopus{
	int num = 786; // non-static global variable
	
	void dance() { //non-static method
		int num = 420; //local var
		System.out.println(num); //420
		System.out.println(this.num); //786
		
		//this keywor must be used rither in non-static method
		//of a class or Constructor
	}
}
public class Dolphin {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Octopus o1 = new Octopus();
		o1.dance();
		System.out.println("Main End");

	}

}
