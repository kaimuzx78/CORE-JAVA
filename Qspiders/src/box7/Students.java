package box7;

public class Students {
	
	private String name;
	private int rollno;
	private double percent;
	public String ChnageKroName;
	
	

	public Students(String name, int rollno, double percent) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.percent = percent;
	}
	
	//public getter and  setter method
	
	//ye hai getter
	public String yeleName() {
		return name;
	}
	
	
	//ye hai setter
	public void ChnageKroName(String name) {
		this.name = name;
	}
	
	//roll no getter
	public int getRollno() {
		return rollno;
	}
	
	//roll number setter
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//percentage getter
	public double getPercent() {
		return percent;
	}
	
	//percentage setter
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	
}
