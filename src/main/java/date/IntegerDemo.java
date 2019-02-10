package date;
/*
 * 自动装箱、自动拆箱，JDK1.5的特性
 * 虚拟机自动帮助转换类型，简化操作
 * 
 * int与字符串的互转
 * 
 * */
public class IntegerDemo {
	public static void main(String[] args) {
//		method1();
		//自动装箱
		Integer a=10; //相当于Integer a=new Integer(10);
		//自动拆箱
		int b=a; //相当于int b=a.intValue();

	}

	private static void method1() {
//		Integer integer=new Integer(52);
		//字符串转int
		int i=Integer.parseInt("20");
		System.out.println(i);
		
		//int转字符串
		String s=Integer.toString(25);
		System.out.println(s);
	}
}
