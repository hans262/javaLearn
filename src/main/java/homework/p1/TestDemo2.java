package homework.p1;

public class TestDemo2 {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setAge(30);
		t.setName("��־��");
		t.setContent("Java�������������");
		t.eat();
		t.lecture();
		
		Student s=new Student();
		s.setAge(18);
		s.setName("����");
		s.setContent("�������");
		s.eat();
		s.study();
	}
}
