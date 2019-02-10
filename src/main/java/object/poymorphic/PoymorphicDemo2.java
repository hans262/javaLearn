package object.poymorphic;

public class PoymorphicDemo2 {
	public static void main(String[] args) {
		Gong g=new Gong();
		g.createPhone(new MinMi());
		g.createPhone(new RedMi());
	}
}


interface Phone{
	public abstract void call();
}
class MinMi implements Phone{
	@Override
	public void call() {
		System.out.println("С�����ڴ�绰");	
	}
}
class RedMi implements Phone{
	@Override
	public void call() {
		System.out.println("�������ڴ�绰");
	}
}
class Gong{
	public void createPhone(Phone p){
		p.call();
	}
}
