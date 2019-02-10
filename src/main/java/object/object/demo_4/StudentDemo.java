package object.object.demo_4;

public class StudentDemo {
	public static void main(String[] args) {
		Student s=new Student("Ðì»á³¤",30);
		System.out.println(s.getName()+","+s.getAge());
		Teacher t=new Teacher();
		t.test(s);
		
		Student s2=t.getStudent();
		s2.study();
		s2.setAge(10);
		s2.setName("ÊÇ¹»");
		System.out.println(s2.getName()+","+s2.getAge());
	}
}
