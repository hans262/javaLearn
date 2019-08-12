package reflect;

import java.lang.reflect.Field;

/*
 * 	ͨ�������ȡ��Ա����
 * 	
 * 	Field[] getFields() : ��ȡ����public���εĳ�Ա����
 * 	Field getField(String name) : ��ȡpublic���εĳ�Ա�����������ֶβ�����ȡ
 * 	Field[] getDeclaredFields() : ��ȡ���еĳ�Ա����
 * 
 * 	
 * 
 * 
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ReflectiveOperationException {
		
		//��ȡ�ֽ������
		Class clazz=Class.forName("reflect.Student");
		//��ȡ����
		Object stu=clazz.newInstance();
		
		//���ñ���������ȡ
		Field f=clazz.getField("age");
		f.set(stu, 19);
		Object age=f.get(stu);
		
		System.out.println(age);
		
		
	}

	private static void demo1(Class clazz) throws ReflectiveOperationException {
		//��������
		Field f=clazz.getField("age");
		System.out.println(f);
		System.out.println("-------------");
		
		//���й���
		Field[] fs=clazz.getFields();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
		}
		System.out.println("------------");
		
		//����
		Field[] fs2=clazz.getDeclaredFields();
		for (int i = 0; i < fs2.length; i++) {
			System.out.println(fs2[i]);
		}
	}
}
