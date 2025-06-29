package box3;

class Track{
	double logi;
	String dist;
	double longi;
	String dist2;
	
	public Track(double logi, String dist, Double longi, String dist2) {
		this.logi = logi;
		this.dist= dist;
		this.longi = longi;
		this.dist2 = dist2;
	}
	
	void gpsinfo(){
		System.out.println("Your Longituie is:"+logi+dist+
				"Your Longitude is :"+longi+dist2);
	}
	
	
}
public class Gps {

	public static void main(String[] args) {
		
		System.out.println("Unkown Location-1");
		Track t1 = new Track(18.54,"N\n",18.5,"E\n");
		t1.gpsinfo();
		
		System.out.println("Unkown Location-2");
		Track t2 = new Track(10.54,"N\n",87.5,"E\n");
		t2.gpsinfo();

	}

}
