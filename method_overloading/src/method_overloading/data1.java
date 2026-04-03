package method_overloading;
class Addition1{
	float add(int x,float y) {
		return x+y;
	}
	float add(float x,int y) {
		return x+y;
	}
}
public class data1 {

	public static void main(String[] args) {
		Addition1 add1=new Addition1();
		System.out.println(add1.add(10,20));

	}

}
