package object.static_;

public class Student {
	String name;
	int age;
	static String from;
	public static void eat() {
		System.out.println(from);
	}
	public void show() {
		System.out.println(name+","+age+","+from);
	}
}
