
public class MetPrime {
boolean checkerDio(int arr[][]){
	for (int r=0;r<arr.length;r++){
		for(int c=0;c<arr[r].length;c++){
			if((r==c && arr[r][c]!=0) ||( r!=c && arr[r][c]!=0)){
				return false;
			}
			
		}
		
	}
	return true;
}

	
	public static void main(String[] args) {
     int num1[][]={{1,0,0},{0,1,0},{1,0,1}};
     int num2[][]={{1,0,0},{0,1,0},{0,0,1}};
     MetPrime sc=new MetPrime();
     System.out.println(sc.checkerDio(num1)? "diagonal" :"not a diagonal ");
     System.out.println(sc.checkerDio(num2)? "diagonal" :"not a diagonal ");
	}

}
