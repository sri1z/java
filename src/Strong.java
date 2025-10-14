
public class Strong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int num=100;num<=100000;num++){
		int temp=num;
		int sum=0;
		while(temp!=0){
		int last=temp%10 ;
		int fct=1;
		for(int i=1;i<=last;i++){
			fct=fct*i;
		}
		sum=sum+fct;
		temp=temp/10;
		}
	}
		if(sum==temp){
		System.out.println("strong num");	
		}
		else{
			System.out.println("not a strong");
		}
		

	}

}
