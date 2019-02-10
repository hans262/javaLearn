package object.object.demo_1;

public class StudentDemo {
	public static void main(String[] args) {
		Student s=new Student();
//		System.out.println(s);
		System.out.println(s.name);
		System.out.println(s.age);
		s.name="уехЩ";
		s.age=28;
		System.out.println(s.name);
		System.out.println(s.age);
		
		s.study();
		s.eat();
	}
}
