package besic.for_while_dowhile;

public class DoWhileDemo {
	public static void main(String[] args) {
		int i=0;
		do{
			System.out.println(i);
			i++;
		}while(i<10);
//		do while 第一次执行不需要任何判断，必定执行一次。
//		第二次执行需判断真假，为真则继续循环执行，为假则跳出循环。
	}
}
