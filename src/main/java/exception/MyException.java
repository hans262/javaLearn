package exception;
/*
 * �����Լ����쳣��
 * 		�̳�Exception:�׳�����ʱ�쳣
 * 		�̳�RuntimeException:�׳�����ʱ�쳣
 * 
 * */
public class MyException extends RuntimeException{
	public MyException() {
		super();
	}
	public MyException(String s) {
		super(s);
	}
}
