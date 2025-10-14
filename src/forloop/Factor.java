package forloop;

public class Factor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
int num =1;
int bs=0;
for(int i=1;i<=num;i++){
	if(num%i==0){
		
		bs++;
		System.out.println(i);
		
	}
}
System.out.println("enter the count"+bs);
if(bs<=2){
	System.out.println("prime");
}
else
{
	System.out.println("not prime");
}
	}

}
