package forloop;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int num=7;
		int fac=1;
		for(i=1;i<=num;i++){
			fac=fac*i;
			
		}
		System.out.println(fac);
	}

}
