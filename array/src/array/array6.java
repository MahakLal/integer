package array;
import java.util.Scanner;
public class array6 {

	public static void main(String[] args) {
		int arr[][][]=new int[3][][];
		arr[0]=new int[3][];
		arr[1]=new int[2][];
		arr[2]=new int[3][];
		arr[0][0]=new int[2];
		arr[0][1]=new int[3];
		arr[0][2]=new int[2];
		arr[1][0]=new int[3];
		arr[1][1]=new int[2];
		arr[2][0]=new int[2];
		arr[2][1]=new int[3];
		arr[2][2]=new int[4];
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
