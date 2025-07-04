package box7;

public class Accenture {

	public static void main(String[] args) {
		Employee e1 = new Employee("Jay", 700, 8007.55);
		
//		System.out.println(e1.name); //CET
//		System.out.println(e1.empid); CTE
//		System.out.println(e1.sal); CTE
		
//		System.out.println(e1.getname()); //cte
		// e1.name = "yo yo jay";
		
		e1.setName("yo yo jay");
		System.out.println(e1.getName());
		
		System.out.println("============");
		
		Employee e2 = new Employee("Kamran", 301, 88743.54);
		
		System.out.println(e2.getSal());
		System.out.println(e2.getName());
	}

}
