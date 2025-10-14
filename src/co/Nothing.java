package co;
import java.util.Scanner;
public class Nothing {
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int a =ab.nextInt();
	if(a%3==0 && a%5==0 )	{
		System.out.println("fizz bus");}
	
		else if(a%3==0){
			System.out.println("fizz");
		}
		else if(a%5==0){
			System.out.println("bus");
		}
	else{
		System.out.println("number invalid");
	}
	}

}
