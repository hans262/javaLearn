package reflect;

import java.lang.reflect.Constructor;

/*
 * 	通过反射获取构造方法并使用
 * 
 * 	Constructor<?>[] getConstructors() : 获取所有public修饰的构造方法
 * 
 * 	Constructor<T> getConstructor(Class<?>... parameterTypes) 
 *  	获取无参构造函数
 * 	
 * 	 T newInstance() 创建此 Class 对象所表示的类的一个新实例
 * 
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws  ReflectiveOperationException {
		Class clazz=Class.forName("reflect.Student");
		
		demo4(clazz);
		
	}
	//获取无参构造函数，更便捷
	private static void demo4(Class clazz) throws ReflectiveOperationException {
		Object obj=clazz.newInstance();
		System.out.println(obj);
	}
	//获取有参构造
	private static void demo3(Class clazz)	throws ReflectiveOperationException {
		Constructor c= clazz.getConstructor(String.class, int.class);
		Object obj=c.newInstance("小明",20);
		System.out.println(obj);
	}
	
	//获取无参构造
	private static void demo2(Class clazz) throws ReflectiveOperationException {
		Constructor c= clazz.getConstructor();
		Object obj=c.newInstance();
		System.out.println(obj);
	}
	//获取所有public修饰的构造
	private static void demo(Class clazz) {
		Constructor[] cs=clazz.getConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
	}
}
