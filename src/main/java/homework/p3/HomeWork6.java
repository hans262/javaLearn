package homework.p3;

public class HomeWork6 {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.work();
		Coder c=new Coder();
		c.work();
	}
}

class Dad{
	String name;//名字
	int id;//工号
	int wages;//工资
	public void work() {
		System.out.println("工作");
	}
}
class Manager extends Dad{
	int bonus;//奖金
	public void work() {
		System.out.println("项目经理正在工作");
	}
}
class Coder extends Dad{
	public void work() {
		System.out.println("程序员正在工作");
	}
}
