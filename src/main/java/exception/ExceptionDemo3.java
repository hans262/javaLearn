package exception;
/*
 * �������쳣
 * 		catch˳�򣺸����������������������
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
		}catch(Exception e) {//�����ܵ��쳣
			System.out.println(e);
		}
		
		
	}

	private static void method1() {
		try {
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException e) {//��ָ���쳣
			System.out.println(e);
		}
		try {
			int[] arr=new int[5];
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {//��������Խ��
			System.out.println(e);
		}
	}
}
