import java.util.Scanner;
public class ArrayLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print("enter the data:");
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
			
			System.out.println();
		}
		
	}

}
