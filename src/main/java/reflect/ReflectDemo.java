package reflect;
/*
 * 	反射：
 * 		在运行时，获取任意一个类的所有方法和属性
 * 		在运行时，调用任意一个对象的所有方法和属性
 * 
 * 	反射的前提：
 * 		获取类的对象（Class对象）
 * 
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//获取Class对象的三种方法
		Student s=new Student();
		Class clazz=s.getClass();
		
		Class clazz2=Student.class;
		
		Class clazz3=Class.forName("reflect.Student");
		
		System.out.println(clazz3.getName());
	}
}
