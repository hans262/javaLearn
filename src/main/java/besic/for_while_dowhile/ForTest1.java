package besic.for_while_dowhile;

public class ForTest1 {
	public static void main(String[] args) {
		int sun=0;
		for(int i=0;i<100;i++){
			int a=i+1;
			if(a%2==0) sun+=a;
		}
		System.out.println(sun);
	}
}
