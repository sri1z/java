
public class spie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num =123;
		int de=num;
		int sum=0;
		while(num!=0){
			int last =num%10;
			sum=sum+last;
			num=num/10;
		}
System.out.println(sum);

int thu=1;
while(de!=0){
	int done =de%10;
	thu=thu*done;
	de=de/10;
}
System.out.println(thu);
if(sum==thu){
	System.out.println("its is spy");
}
else{
	System.out.println("its is not spy");
}
	}

}
