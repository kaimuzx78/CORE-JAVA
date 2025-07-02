package box4;

public class Homew2 {
	
		String name;
		final String UID; //unique id taking insated of pnr which is numberr only
		double percentage;
		private static int randomno = 301;
		
		
	
	public Homew2(String name, double percentage) {
			this.name = name;
			this.UID = "BSCIT25"+randomno++;
			this.percentage = percentage;
		}
	
	void info() {
		System.out.println("Student name is:"+name+
				"\nYour Unique ID is:"+UID+"\nYour percentage is:"
				+percentage);
	}
	public static void main(String[] args) {
		System.out.println("Student detials are below: ");
		System.out.println("----------------------");
		
		Homew2 h1 = new Homew2("Kaimu", 85.00);
		h1.info();
		
		System.out.println("----------------------");
		
		Homew2 h2 = new Homew2("Aadhesh", 80.00);
		h2.info();
		System.out.println("----------------------");
		
		Homew2 h3 = new Homew2("DEMO1", 81.00);
		h3.info();
	}

}
