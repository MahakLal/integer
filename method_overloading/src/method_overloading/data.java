package method_overloading;
class Addition{
	int add(int x,int y) {
		return x+y;
	}
	float add(int x,float y) {
		return x+y;
	}
	float add(float x,int y) {
		return x+y;
	}
	float add(float x,float y) {
		return x+y;
	}
	int add(int x,int y,int z) {
		return x+y+z;
	}
	float add(int x,float y,float z) {
		return x+y+z;
	}
	float add(int x,int y,float z) {
		return x+y+z;
	}
	float add(float x,float y,float z) {
		return x+y+z;
	}
}
public class data {

	public static void main(String[] args) {
		Addition add1=new Addition();
		System.out.println(add1.add(10,20));
		System.out.println(add1.add(10,20.5f));
		System.out.println(add1.add(30.5f,30));
	}

}
