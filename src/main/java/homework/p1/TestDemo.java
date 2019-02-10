package homework.p1;

public class TestDemo {
	public static void main(String[] args) {
		Manager m=new Manager();
		Coder c=new Coder();
		m.setId(123);
		m.setSalary(15000);
		m.setbonus(6000);
		c.setId(135);
		c.setSalary(10000);
		m.work();
		c.work();
	}
}
