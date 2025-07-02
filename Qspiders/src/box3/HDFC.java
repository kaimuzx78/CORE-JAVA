package box3;

public class HDFC {
	static String branch;
	static String ifsc;
			int age; //non static global variable
			
			static {
				branch="HDFC THANE";
				ifsc="HDFC123520";
				//age = 21; //error CTE
				//static block are used for initilizing.
				//only static variable
				
			}

	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println(branch);
		System.out.println(ifsc);
		
		System.out.println("Main End");
	}

}
