package box7;

public class School {

	public static void main(String[] args) {
		
		Students s1 = new Students("Kaimu", 31, 86.4);
		
		Students s2 = new Students("Arjun", 54, 40.4);
		
		
		System.out.println(s1.yeleName());
		System.out.println(s1.getRollno());
		System.out.println(s1.getPercent());
		
		
		//changing the values here 
		s1.ChnageKroName("karma11");
		System.out.println(s1.yeleName());
		
	}

}
