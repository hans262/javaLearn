package date;

public class ToStringDemo {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="уехЩ";
		s.age=25;
		System.out.println(s.toString());
	}
}
class Student{
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
