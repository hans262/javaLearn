package besic.for_while_dowhile;

public class ForTest2 {
	public static void main(String[] args) {
		int num=0;
		for(int i=100;i<1000;i++){
			int a=i/10/10%10;
			int b=i/10%10;
			int c=i%10;
			if(i==(a*a*a+b*b*b+c*c*c)){
				System.out.println(i);
				num+=1;
			}
		}
		System.out.println(num);
	}
}
