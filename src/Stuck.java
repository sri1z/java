import java.util.Scanner;
import java.util.Stack;
public class Stuck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer>st=new Stack();
		st.push(1);
		st.push(33);
		st.push(99);
		st.push(22);
		st.push(14);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.empty());
		st.clear();

	}

}
