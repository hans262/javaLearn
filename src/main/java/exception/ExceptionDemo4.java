package exception;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//输出原因
			System.out.println(e.getMessage());
			//输出原因，错误类型
			System.out.println(e.toString());
			//输出原因、错误类型、位置
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
