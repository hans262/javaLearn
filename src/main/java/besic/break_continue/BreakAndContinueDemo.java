package besic.break_continue;

public class BreakAndContinueDemo {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i%3==0){
				break;//跳出循环
//				continue;//只跳出本次循环，下一次继续执行
			}
			System.out.println(i);
		}
	}
}
