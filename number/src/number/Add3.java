//no input output
package number;
class Addition4{
	int a=10;
	int b=20;
	int add() {
		int c=a+b;
		return c;
	}
}
public class Add3 {

	public static void main(String[] args) {
		Addition4 add2=new Addition4();
		int ans=add2.add();
		System.out.println(ans);
	}

}
