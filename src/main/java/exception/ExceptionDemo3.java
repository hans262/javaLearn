package exception;
/*
 * 处理多个异常
 * 		catch顺序：父类对象必须放在子类对象后面
 * 
 * 
 * */
public class ExceptionDemo3 {
	public static void main(String[] args) {
//		method1();
		
		try {
			String s=null;
			System.out.println(s.length());
			int[] arr=new int[5];
			System.out.println(arr[5]);
			System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {//处理总的异常
			System.out.println(e);
		}
		
		
	}

	private static void method1() {
		try {
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException e) {//空指针异常
			System.out.println(e);
		}
		try {
			int[] arr=new int[5];
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {//数组索引越界
			System.out.println(e);
		}
	}
}
