package homework.p1;

public class Student {
	private String name;
	private int age;
	private String content;
	public Student() {}
	public void eat() {
		System.out.println("����Ϊ"+this.age+"��"+this.name+"ͬѧ���ڳԷ�....");
	}
	public void study() {
		System.out.println("����Ϊ"+this.age+"��"+this.name+"ͬѧ����ר����־������"+this.content+"��֪ʶ....");
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
