package besic.for_while_dowhile;

public class WhileTest1 {
	public static void main(String[] args) {
		int sun=0;
		int i=0;
		while(i<100){
			sun+=(i+1);
			i++;
		}
		System.out.println("1到100求和："+sun);
		
		int num=0;
		int x=100;
		while(x<1000){
			int a=x%10;
			int b=x/10%10;
			int c=x/10/10%10;
			if(x==(a*a*a+b*b*b+c*c*c)) num++;
			x++;
		}
		System.out.println("水仙花数的个数："+num);
	}
}
