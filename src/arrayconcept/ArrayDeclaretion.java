package arrayconcept;

public class ArrayDeclaretion {

	public static void main(String[] args) {
		String arr[]={"kavin","harish","kabil","salman"};
		arr[1]="srihari";
		arr[3]=arr[0];
		arr[0]="ucg";
		String b=arr[3];
		System.out.println(b);
		String c=arr[0];
		System.out.println(c);
		String a=arr[1];
		System.out.println(a);

	}

}
