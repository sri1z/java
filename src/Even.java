
public class Even {
	boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Even e=new Even();
System.out.println(e.isEven(5)? "even":"odd");
	}

}
