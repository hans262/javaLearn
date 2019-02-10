package besic.test;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("所有五位数的回文数：");
		getPal();
	}
	public static void getPal(){
		for(int i=10000;i<100000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/10/10%10;
			int d=i/10/10/10%10;
			int e=i/10/10/10/10%10;
			if(a==e && b==d) System.out.println(i);
		}
	}
}
