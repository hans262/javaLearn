package exception;
/*
 * �쳣��
 * 		����ʱ�쳣��д�����ʱ���Ҫ�����쳣��Exception�������쳣����RuntimeException����
 * 			IO�쳣
 * 		����ʱ�쳣������ʱ�������쳣��RuntimeException�������쳣
 * 			��ѧ�쳣����ָ���쳣������Խ��
 * �쳣�Ĵ���ʽ��
 * 		jvm������������쳣��Ϣ��ӡ�ڿ���̨���˳������
 * 		try...catch���������쳣�Ż�ִ��catch�������
 * */
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(1);//ִ��
			System.out.println(10/0);
			System.out.println(123);//��ִ��
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(456);
	}
}
