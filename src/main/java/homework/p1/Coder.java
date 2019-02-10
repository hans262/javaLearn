package homework.p1;

public class Coder {
	private String name;
	private int id;
	private int salary;
	public Coder() {}
	public void work() {
		System.out.println("工号为"+this.id+"基本工资为"+this.salary+"的程序员正在努力的写着代码......");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
}
