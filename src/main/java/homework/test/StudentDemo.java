package homework.test;

public class StudentDemo {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("wanghuahua");
		s.age=28;
		s.sex="male";
		s.say();
		System.out.println(s.getName());
	}
}
