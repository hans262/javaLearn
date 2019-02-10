package object.object.demo_1;

public class Student {
	String name;
	int age;
	private String sex;
	public void setSex(String x) {
		if(x!="男" && x!="女") System.out.println("你输入的性别有误");
		else sex= x;
	}
	public String getSex() {
		return sex;
	}
	public void study() {
		System.out.println("好好学习天天向上");
	}
	public void eat() {
		System.out.println("我去吃饭咯");
	}
	public void sayName() {
		System.out.println("名字是:"+name);
	}
	public void sayAge() {
		System.out.println("年龄是:"+age);
	}
	public void saySex() {
		System.out.println("性别是:"+sex);
	}
}
