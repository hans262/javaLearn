package homework.p1;

public class Teacher {
	private String name;
	private int age;
	private String content;
	public Teacher() {}
	
	public void eat() {
		System.out.println("����Ϊ"+this.age+"��"+this.name+"��ʦ���ڳԷ�....");
	}
	public void lecture() {
		System.out.println("����Ϊ"+this.age+"��"+this.name+"��ʦ���ڿ��ܵĽ���"+this.content+"��֪ʶ........");
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
