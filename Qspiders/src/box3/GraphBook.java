package box3;
class Graph{
	double xaxis;
	double yasis;
	
	public Graph(double xaxis, double yasis) {
		this.xaxis = xaxis;
		this.yasis = yasis;
	}
	void info() {
		System.out.println("Graph point ---->("+xaxis+","+yasis+")");
	}
}

public class GraphBook {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Graph g1 = new Graph(1.0,3.5);
		g1.info();
		
		Graph g2 = new Graph(2,5);
		g2.info();
		
		Graph g3 = new Graph(4,5);
		g3.info();
		
		System.out.println("Main End");
	}

}
