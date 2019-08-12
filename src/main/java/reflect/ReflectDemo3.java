package reflect;

import java.lang.reflect.Field;

/*
 * 	通过反射获取成员变量
 * 	
 * 	Field[] getFields() : 获取所有public修饰的成员变量
 * 	Field getField(String name) : 获取public修饰的成员变量，根据字段参数获取
 * 	Field[] getDeclaredFields() : 获取所有的成员变量
 * 
 * 	
 * 
 * 
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ReflectiveOperationException {
		
		//获取字节码对象
		Class clazz=Class.forName("reflect.Student");
		//获取对象
		Object stu=clazz.newInstance();
		
		//设置变量，并获取
		Field f=clazz.getField("age");
		f.set(stu, 19);
		Object age=f.get(stu);
		
		System.out.println(age);
		
		
	}

	private static void demo1(Class clazz) throws ReflectiveOperationException {
		//单个公共
		Field f=clazz.getField("age");
		System.out.println(f);
		System.out.println("-------------");
		
		//所有公共
		Field[] fs=clazz.getFields();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
		}
		System.out.println("------------");
		
		//所有
		Field[] fs2=clazz.getDeclaredFields();
		for (int i = 0; i < fs2.length; i++) {
			System.out.println(fs2[i]);
		}
	}
}
