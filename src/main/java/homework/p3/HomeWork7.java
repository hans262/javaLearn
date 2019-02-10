package homework.p3;

public class HomeWork7 {
	public static void main(String[] args) {
		Stu s=new Stu();
		s.name="徐会长";
		System.out.println(s.name);
		s.eat();
		s.study();
		Teacher t=new Teacher();
		t.name="黄厅长";
		System.out.println(t.name);
		t.eat();
		t.lecture();
	}
}
class Dads{
	String name;
	int age;
	public void eat() {
		System.out.println("父亲正在吃饭");
	}
}
class Stu extends Dads{
	public void eat() {
		System.out.println("学生正在吃饭");
	}
	public void study() {
		System.out.println("学生正在学习");
	}
}
class Teacher extends Dads{
	public void eat() {
		System.out.println("老师正在吃饭");
	}
	public void lecture() {
		System.out.println("老师正在讲课");
	}
}