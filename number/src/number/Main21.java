package number;
class Fan{
	int number_of_wings;
	String colour;
	int cost;
	void rotate() {
		System.out.println("Fan rotates");
	}
	void fansair() {
		System.out.println("Fans air");
	}
	void stop() {
		System.out.println("Fan stop");
	}
	
}
public class Main21 {
	public static void main(String[] args) {
		Fan f=new Fan();
		f.rotate();
		f.fansair();
		f.stop();
	}
}
