package homework.p3;

public class HomeWork8 {
	public static void main(String[] args) {
		Staff s=new Staff();
		s.work();
		Mana m=new Mana();
		m.work();
		Waiter w=new Waiter();
		w.work();
	}
}
class Father{
	int id;
	String name;
	public void work() {
		System.out.println("工作");
	}
}
class Staff extends Father{
	public void work() {
		System.out.println("员工工作");
	}
}
class Mana extends Father{
	int bonus;
	public void work() {
		System.out.println("管理员工");
	}
}
class Waiter extends Father{
	public void work() {
		System.out.println("为客户服务");
	}
}
