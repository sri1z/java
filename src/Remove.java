import java.util.LinkedList;
public class Remove {

	
	public static void main(String[] args) {
		LinkedList<Integer> ll =new LinkedList<Integer>();
		ll.add(23);
		ll.add(45);
		ll.add(49);
		ll.add(22);
		ll.add(77);
		ll.add(66);
		System.out.println(ll);
		System.out.println(ll.contains(45));
		System.out.println(ll.get(0));
		ll.remove();
		ll.removeLast();
		
		

	}

}
