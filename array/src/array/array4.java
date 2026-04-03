package array;
import java.util.Scanner;
public class array4 {

	public static void main(String[] args) {
		int arr[][]=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of class"+i+"student"+j);
				arr[i][j]=scan.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {	
				System.out.println(arr[i][j]);
			}
		}

	}

}
