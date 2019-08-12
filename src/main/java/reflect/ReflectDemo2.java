package reflect;

import java.lang.reflect.Constructor;

/*
 * 	ͨ�������ȡ���췽����ʹ��
 * 
 * 	Constructor<?>[] getConstructors() : ��ȡ����public���εĹ��췽��
 * 
 * 	Constructor<T> getConstructor(Class<?>... parameterTypes) 
 *  	��ȡ�޲ι��캯��
 * 	
 * 	 T newInstance() ������ Class ��������ʾ�����һ����ʵ��
 * 
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws  ReflectiveOperationException {
		Class clazz=Class.forName("reflect.Student");
		
		demo4(clazz);
		
	}
	//��ȡ�޲ι��캯���������
	private static void demo4(Class clazz) throws ReflectiveOperationException {
		Object obj=clazz.newInstance();
		System.out.println(obj);
	}
	//��ȡ�вι���
	private static void demo3(Class clazz)	throws ReflectiveOperationException {
		Constructor c= clazz.getConstructor(String.class, int.class);
		Object obj=c.newInstance("С��",20);
		System.out.println(obj);
	}
	
	//��ȡ�޲ι���
	private static void demo2(Class clazz) throws ReflectiveOperationException {
		Constructor c= clazz.getConstructor();
		Object obj=c.newInstance();
		System.out.println(obj);
	}
	//��ȡ����public���εĹ���
	private static void demo(Class clazz) {
		Constructor[] cs=clazz.getConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
	}
}
