package besic.method;

public class MethodDemo {
	public static void main(String[] args) {
		shuiNum();
	}
	public static void shuiNum(){
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/10/10%10;
			if(i==(a*a*a+b*b*b+c*c*c)) System.out.println(i);
		}
	}
}
