package object.abstract_;

public class AbstractTest1 {
	public static void main(String[] args) {
		BasicTeacher bt=new BasicTeacher();
		bt.setName("张三");
		bt.teach();
		
		JobTeacher jt=new JobTeacher();
		jt.setName("黄三");
		jt.teach();
	}
}
class BasicTeacher extends Teacher{
	@Override
	public void teach() {
		System.out.println(getName()+"老师讲javaSE课程");
	}
}
class JobTeacher extends Teacher{
	@Override
	public void teach() {
		System.out.println(getName()+"老师讲javaEE课程");
	}
}

abstract class Teacher{
	private static String name="徐会长";
	private int age;
	private String sex;
	public abstract void teach();
	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
