package box4;

public class Kaimu {
	{ //non-static block 1
		System.out.println("A kitne aadmi thy!...");
	}
	
	{ //non-static block 2
		System.out.println("B do thy sardar");
	}

	public static void main(String[] args) {
		System.out.println("C Main Start");
		
		Kaimu k1 = new Kaimu();
		System.out.println("--------");
		Kaimu k2 = new Kaimu();
		
		System.out.println("D Main End");

	}
	
	//non-static block 3
	{
		System.out.println("unka naam tha jay aur viru");
	}

}
