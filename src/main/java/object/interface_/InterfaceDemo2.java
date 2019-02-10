package object.interface_;

import java.sql.Array;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Lqjr lqjr=new Lqjr();
		lqjr.setName("����������");
		lqjr.learnEng();
		
		Lqer lqer=new Lqer();
		lqer.learnEng();
		lqer.study();
		
		Ppjr ppjr=new Ppjr();
		ppjr.teach();
		ppjr.eat();
	}
}
interface LearnEnglish{
	public abstract void learnEng();
}

class Pper extends Yundong{
	@Override
	public void study() {
		System.out.println("ƹ�����˶�Աѧ����");
	}
}
class Lqer extends Yundong implements LearnEnglish{
	@Override
	public void study() {
		System.out.println("�����˶�Աѧ����");
	}
	@Override
	public void learnEng() {
		System.out.println("��������Զ��ԱҪѧӢ��");
	}
}
abstract class Yundong extends Person{
	public abstract void study();
}
class Lqjr extends Jiaolian implements LearnEnglish{
	@Override
	public void teach() {
		System.out.println("��������̿���");
	}
	@Override
	public void learnEng() {
		System.out.println("�����������ҪѧӢ��");
	}
}
class Ppjr extends Jiaolian{
	@Override
	public void teach() {
		System.out.println("ƹ��������̳���");
	}
}
abstract class Jiaolian extends Person{
	public abstract void teach();
}
class Person{
	private String name;
	private int age;
	private String sex;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String sex) {
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
	public void eat(){
		System.out.println("�Է�");
	}
	public void sleep(){
		System.out.println("˯��");
	}
}