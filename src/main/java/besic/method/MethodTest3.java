package besic.method;

public class MethodTest3 {
	public static void main(String[] args) {
		System.out.println(sum(25,46));
		System.out.println(sum(25,46,20));
	}
	public static int sum(int a,int b){
		return a+b;
	}
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	public static float sum(float a,float b){
		return a+b;
	}
}
