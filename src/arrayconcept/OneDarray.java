package arrayconcept;

public class OneDarray {

	public static void main(String[] args) {
		int arr[]={33,45,78,98};
		int num=arr[0];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				System.out.println("unsorted");
				return;
			}
		}
		System.out.println("sorted");
	}

}
