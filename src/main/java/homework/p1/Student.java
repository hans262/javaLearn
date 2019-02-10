package homework.p1;

public class Student {
	private String name;
	private int age;
	private String content;
	public Student() {}
	public void eat() {
		System.out.println("年龄为"+this.age+"的"+this.name+"同学正在吃饭....");
	}
	public void study() {
		System.out.println("年龄为"+this.age+"的"+this.name+"同学正在专心致志的听着"+this.content+"的知识....");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public String getContent() {
		return this.content;
	}
}
