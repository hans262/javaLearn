package object.abstract_;

public class AbstractTest1 {
	public static void main(String[] args) {
		BasicTeacher bt=new BasicTeacher();
		bt.setName("����");
		bt.teach();
		
		JobTeacher jt=new JobTeacher();
		jt.setName("����");
		jt.teach();
	}
}
class BasicTeacher extends Teacher{
	@Override
	public void teach() {
		System.out.println(getName()+"��ʦ��javaSE�γ�");
	}
}
class JobTeacher extends Teacher{
	@Override
	public void teach() {
		System.out.println(getName()+"��ʦ��javaEE�γ�");
	}
}

abstract class Teacher{
	private static String name="��᳤";
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
