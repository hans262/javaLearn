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
	String name;//����
	int id;//����
	int wages;//����
	public void work() {
		System.out.println("����");
	}
}
class Manager extends Dad{
	int bonus;//����
	public void work() {
		System.out.println("��Ŀ�������ڹ���");
	}
}
class Coder extends Dad{
	public void work() {
		System.out.println("����Ա���ڹ���");
	}
}
