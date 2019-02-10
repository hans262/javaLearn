package exception;
/*
 * 定义自己的异常类
 * 		继承Exception:抛出编译时异常
 * 		继承RuntimeException:抛出运行时异常
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
