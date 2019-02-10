package besic.other;

public class HelloWorld {
	public static void main(String[] args) {
		int a=5;
		int b=25;
		int c=10;
//		a++;
		int tamp=(a>b)?a:b;
		int max=(tamp>c)?tamp:c;
		boolean d=(a>b)?true:false;
		System.out.println(max);
	}
}
