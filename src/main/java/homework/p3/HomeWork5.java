package homework.p3;

public class HomeWork5{
	public static void main(String[] args) {
		Student s=new Student();
		s.work();
		Worker w=new Worker();
		w.work();
		StudentLeader sl=new StudentLeader();
		sl.work();
	}
}
class Student extends Person{
	String school;//ѧУ
	int stuNumber;
	public void work() {
		System.out.println("ѧ���Ĺ�����ѧϰ");
	}
}
class Worker extends Person{
	String unit;//��λ
	int workAge;//����
	public void work() {
		System.out.println("���˵Ĺ����ǸǷ���");
	}
}
class StudentLeader extends Person{
	String job;//ְ��
	public void meeting() {
		System.out.println("����");
	}
}
class Person {
	String name;//����
	String gender;//�Ա�
	int age;//����
	String nationality;//����
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
	public void work() {
		System.out.println("����");
	}
}


