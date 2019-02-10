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
	String school;//学校
	int stuNumber;
	public void work() {
		System.out.println("学生的工作是学习");
	}
}
class Worker extends Person{
	String unit;//单位
	int workAge;//工龄
	public void work() {
		System.out.println("工人的工作是盖房子");
	}
}
class StudentLeader extends Person{
	String job;//职务
	public void meeting() {
		System.out.println("开会");
	}
}
class Person {
	String name;//姓名
	String gender;//性别
	int age;//年龄
	String nationality;//国籍
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	public void work() {
		System.out.println("工作");
	}
}


