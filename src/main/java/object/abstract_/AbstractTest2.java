package object.abstract_;

public class AbstractTest2 {
	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.setName("程序员");
		p.setId(002);
		p.setPay(10000);
		p.work();
		
		Manager m=new Manager();
		m.setName("项目经理");
		m.setId(001);
		m.setPay(20000);
		m.setBouns((byte)100);
		m.work();
	}
}
class Manager extends Employee{
	private byte bouns;
	public byte getBouns() {
		return bouns;
	}
	public void setBouns(byte bouns) {
		this.bouns = bouns;
	}
	@Override
	public void work() {
		System.out.println(getName()+"正在盯着程序员写代码。。。");
	}
}

class Programmer extends Employee{
	@Override
	public void work() {
		System.out.println(getName()+"正在写代码。。。");
	}
}

abstract class Employee{
	private String name;
	private int id;
	private double pay;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, double pay) {
		super();
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public abstract void work();
}
