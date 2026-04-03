package encapsulation;
class Book2{
	private int page_number;
	public void setPageNumber(int x) {
		if(x>0) {
			page_number=x;
		}
		else
		{
			System.out.println("Invalid page number");
		}
	}
	public int getPageNumber() {
		return page_number;
	}
}

public class data2 {

	public static void main(String[] args) {
		Book2 b=new Book2();
		b.setPageNumber(-100);
		System.out.println(b.getPageNumber());
	}
}
