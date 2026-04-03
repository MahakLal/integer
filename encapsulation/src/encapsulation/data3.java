package encapsulation;
class ABC{
	private String cde;
	private String klm;
	private String vyz;
	public void setcde(String x) {
		cde=x;
	}
	public void setklm(String y) {
		klm=y;
	}
	public void setvyz(String z) {
		vyz=z;
	}
	public void display() {
		System.out.println(cde);
		System.out.println(klm);
		System.out.println(vyz);
		
	}
}
public class data3 {
	public static void main(String[] args) {
		ABC d=new ABC();
		d.setcde("abc");
		d.setklm("ste");
		d.setvyz("hjl");
		d.display();

	}

}
