package basic;

public class Numm {

	int num=1;  //instance

	static int num1=1;  //static refers unique memory for entire class

	void disp() {

		int num=25;//local

		num1++;

		num++;

		System.out.println("Ins " +num);

		System.out.println("Static "+num1);

	}

	public static void main(String[] args) {

		Numm s1=new Numm();

		Numm s2=new Numm();

		Numm s3=new Numm();

		s1.disp();

		s2.disp();

		s3.disp();

	}

}
