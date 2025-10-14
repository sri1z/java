package arrayconcept;

public class Gooooo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num[]={45,22,65,61,12};
		int sum=0;
		int con=0;
		for(int i=0;i<num.length;i++){
			 sum=num[i];
			System.out.println(sum);
		
		while(sum!=0){
			int a=num[i]%10;
			if(sum<a){
				
				con=a;
				
				
			}
			con=con/10;
			System.out.println(con);
				
			}
			
		}
		
		
	}

}
