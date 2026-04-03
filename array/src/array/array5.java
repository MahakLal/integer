package array;
import java.util.Scanner;
public class array5 {

	public static void main(String[] args) {
		int arr[][][]=new int[3][2][3];
		Scanner scan=new Scanner(System.in);
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println("Enter the marks of school"+i+"class"+j+"student"+k);
							arr[i][j][k]=scan.nextInt();
						}
					}
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println(arr[i][j][k]);
						}
					}
				}

	}

}
