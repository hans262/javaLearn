package object.object.demo_1;

public class Student {
	String name;
	int age;
	private String sex;
	public void setSex(String x) {
		if(x!="��" && x!="Ů") System.out.println("��������Ա�����");
		else sex= x;
	}
	public String getSex() {
		return sex;
	}
	public void study() {
		System.out.println("�ú�ѧϰ��������");
	}
	public void eat() {
		System.out.println("��ȥ�Է���");
	}
	public void sayName() {
		System.out.println("������:"+name);
	}
	public void sayAge() {
		System.out.println("������:"+age);
	}
	public void saySex() {
		System.out.println("�Ա���:"+sex);
	}
}
