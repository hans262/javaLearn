package object.object.demo_4;

public class Student {
	private String name;
	private int age;
	
	public void study(){
		System.out.println("好好学习，天天向上！");
	}
	
	public Student(){}
	public Student(String name){
		this.name=name;
	}
	public Student(int age){
		this.age=age;
	}
	public Student(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
}
