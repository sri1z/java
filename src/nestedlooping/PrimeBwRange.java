package nestedlooping;

public class PrimeBwRange {
	public static void main(String[] args) {
int num=1;
int bs=0;
for(int i=1;i<=num;i++){
	if(num%i==0){
		
		bs++;
		
		
	}
}

if(bs==2){
	System.out.println(num);
}
	}

}
