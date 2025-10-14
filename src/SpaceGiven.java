
public class SpaceGiven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[][]={{2,3,4,5},{4,5,6,7},{4,5,8,7}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]%2==0){
					System.out.print(arr[i][j]+" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
