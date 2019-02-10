package object.interface_;

import java.sql.Array;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Lqjr lqjr=new Lqjr();
		lqjr.setName("篮球王教练");
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
		System.out.println("乒乓球运动员学抽球");
	}
}
class Lqer extends Yundong implements LearnEnglish{
	@Override
	public void study() {
		System.out.println("篮球运动员学扣篮");
	}
	@Override
	public void learnEng() {
		System.out.println("出国篮球远动员要学英语");
	}
}
abstract class Yundong extends Person{
	public abstract void study();
}
class Lqjr extends Jiaolian implements LearnEnglish{
	@Override
	public void teach() {
		System.out.println("篮球教练教扣篮");
	}
	@Override
	public void learnEng() {
		System.out.println("出国篮球教练要学英语");
	}
}
class Ppjr extends Jiaolian{
	@Override
	public void teach() {
		System.out.println("乒乓球教练教抽球");
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
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
}