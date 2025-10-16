package arrayconcept;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Sooort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("it");arr.add("cse");arr.add("ece");
		System.out.println("before sorting");
		System.out.println(arr);
		System.out.println("after sorting");
		Collections.sort(arr);
		for(String str:arr){
			System.out.println(str+" ");
		}
		System.out.println();
		System.out.println("to search the element: "+arr);

	}

}
