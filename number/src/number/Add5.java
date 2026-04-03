package number;
class Addition5{
	int c;
	int add5(int a,int b) {
		c=a+b;
		return c;
	}
}
public class Add5 {

	public static void main(String[] args) {
		Addition5 add=new Addition5();
		int answer=add.add5(10,20);
		System.out.println(answer);
	}
}
