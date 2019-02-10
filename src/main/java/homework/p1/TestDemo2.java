package homework.p1;

public class TestDemo2 {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setAge(30);
		t.setName("周志鹏");
		t.setContent("Java基础中面向对象");
		t.eat();
		t.lecture();
		
		Student s=new Student();
		s.setAge(18);
		s.setName("韩光");
		s.setContent("面向对象");
		s.eat();
		s.study();
	}
}
