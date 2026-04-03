package array;

public class array {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("For loop");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("While loop");
		int j=0;
		while(j<arr.length) {
			System.out.println(arr[j]);
			j++;
		}
		System.out.println("Do while loop");
		int k=0;
		do {
			System.out.println(arr[k]);
			k++;
		}while(k<arr.length);
		System.out.println("For each loop");
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
