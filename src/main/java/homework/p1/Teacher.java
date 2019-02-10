package homework.p1;

public class Teacher {
	private String name;
	private int age;
	private String content;
	public Teacher() {}
	
	public void eat() {
		System.out.println("年龄为"+this.age+"的"+this.name+"老师正在吃饭....");
	}
	public void lecture() {
		System.out.println("年龄为"+this.age+"的"+this.name+"老师正在亢奋的讲着"+this.content+"的知识........");
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
