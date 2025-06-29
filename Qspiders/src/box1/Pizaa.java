package box1;

public class Pizaa {
	public static void main(String[] args) {
		char gen = 'M';
		
		switch(gen)
		{
		case 'M','m' : System.out.println("Mard");
		break;
		case 'F','f' : System.out.println("Stree");
		break;
		case 'O' : System.out.println("gudd");
		break;
		default: System.out.println("Invalid");
		}
	}

}
