package homework.p3;

public class HomeWork7 {
	public static void main(String[] args) {
		Stu s=new Stu();
		s.name="��᳤";
		System.out.println(s.name);
		s.eat();
		s.study();
		Teacher t=new Teacher();
		t.name="������";
		System.out.println(t.name);
		t.eat();
		t.lecture();
	}
}
class Dads{
	String name;
	int age;
	public void eat() {
		System.out.println("�������ڳԷ�");
	}
}
class Stu extends Dads{
	public void eat() {
		System.out.println("ѧ�����ڳԷ�");
	}
	public void study() {
		System.out.println("ѧ������ѧϰ");
	}
}
class Teacher extends Dads{
	public void eat() {
		System.out.println("��ʦ���ڳԷ�");
	}
	public void lecture() {
		System.out.println("��ʦ���ڽ���");
	}
}