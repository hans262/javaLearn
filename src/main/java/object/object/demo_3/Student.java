package object.object.demo_3;

public class Student {
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if(age<0 || age>100) System.out.println("���������������");
		else this.age=age;
	}
	public int getAge() {
		return this.age;
	}
}
