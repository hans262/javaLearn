package exception;
/*
 * 异常：
 * 		编译时异常：写代码的时候就要处理异常、Exception的子类异常，非RuntimeException子类
 * 			IO异常
 * 		运行时异常：运行时发生的异常、RuntimeException的子类异常
 * 			数学异常、空指针异常、数组越界
 * 异常的处理方式：
 * 		jvm虚拟机处理：把异常信息打印在控制台，退出虚拟机
 * 		try...catch处理：发生异常才会执行catch里的内容
 * */
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(1);//执行
			System.out.println(10/0);
			System.out.println(123);//不执行
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(456);
	}
}
