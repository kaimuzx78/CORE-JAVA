package box7;

public class Employee { //public class
	
	private String name; // 3 private attribute
	private int empid;
	private double sal;
	
	

	public Employee(String name, int empid, double sal) {
		super();
		this.name = name;
		this.empid = empid;
		this.sal = sal;
	}
	
	
	//public getter and  setter method
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getEmpid() {
		return empid;
	}




	public void setEmpid(int empid) {
		this.empid = empid;
	}




	public double getSal() {
		return sal;
	}




	public void setSal(double sal) {
		this.sal = sal;
	}




	public static void main(String[] args) {
		

	}

}
