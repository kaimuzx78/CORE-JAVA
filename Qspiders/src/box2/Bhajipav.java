package box2;

class Tesla{
	String color;  //non-static global var
	int speed;
	double bCap;
	
	void race() { //non-static method
		System.out.println("racing....");
	}
}

//Syntax
//ClassName refvarname = new Classname();

public class Bhajipav {

	public static void main(String[] args) {
		System.out.println("main start");
		Tesla t1 = new Tesla(); //object 1
		System.out.println("t1 address "+ t1); // t1 memory address
		
		System.out.println("---------------");
		Tesla t2 = new Tesla();
		System.out.println("t2 address "+ t2); // t2 memory address
		
		t1.color="red"; // object1 color change
		t2.speed = 100; // object2 speed chnage
		
		System.out.println("----t1 object 1----");
		System.out.println(t1.color); //red
		System.out.println(t1.speed); //speed
		System.out.println(t1.bCap); //battry
	}

}
