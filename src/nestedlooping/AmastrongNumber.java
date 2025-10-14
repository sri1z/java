package nestedlooping;

public class AmastrongNumber {
	public static void main(String[] args) {
		for(int num=100;num<=10000;num++){
		int temp= num;
		int len=0;
		while(num!=0){
			len++;
			num=num/10;
		}
		
		num=temp;
		int sum=0;
		while(num!=0){
			int last=num%10;
			int pow=1;
			for(int i=1;i<=len;i++){
				pow=last*pow;
			}
			sum=sum+pow;
			num=num/10;
		}
		num=temp;
		}
		
		System.out.println(temp);
	}

}
