package basic;

public class Static {

	String name;

	static String clg;

	void disp() {

		System.out.println(name+" "+clg);

	}

	public static void main(String[] args) {

		Static s1=new Static();

		Static s2=new Static();

		s1.name="Kabilan";

		clg="Vcet";

		s2.name="Harish";

		s1.disp();

		s2.disp();

	}

}
