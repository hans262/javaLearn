package reflect;
/*
 * 	���䣺
 * 		������ʱ����ȡ����һ��������з���������
 * 		������ʱ����������һ����������з���������
 * 
 * 	�����ǰ�᣺
 * 		��ȡ��Ķ���Class����
 * 
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡClass��������ַ���
		Student s=new Student();
		Class clazz=s.getClass();
		
		Class clazz2=Student.class;
		
		Class clazz3=Class.forName("reflect.Student");
		
		System.out.println(clazz3.getName());
	}
}
