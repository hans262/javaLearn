package homework.test;

public class Student {
	private String name;
	int age;
	String sex;
	public void setName(String x) {
		name=x;
	}
	public String getName() {
		return name;
	}
	public void say() {
		System.out.println(name+","+age+","+sex);
	}
}
