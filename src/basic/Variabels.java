package basic;

public class Variabels {

	int insVar=25;   //instance variable scope for entire class

	void meth() {

		int locVar=50;   //local variable scope upto this segment

		System.out.println(locVar);

		System.out.println(insVar);

	}

	void disp() {

		//System.out.println(locVar);  cant access since it is local variable of above method

		System.out.println(insVar);




	}

	public static void main(String[] args) {

		
	}

}
