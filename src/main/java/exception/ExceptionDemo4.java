package exception;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//���ԭ��
			System.out.println(e.getMessage());
			//���ԭ�򣬴�������
			System.out.println(e.toString());
			//���ԭ�򡢴������͡�λ��
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
