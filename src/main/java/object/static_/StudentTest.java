package object.static_;

public class StudentTest {
	public static void main(String[] args) {
		Student.from="传智学院";
		Student s=new Student();
//		s.from="黑马";
		s.show();
		s.eat();
		
	}
}
