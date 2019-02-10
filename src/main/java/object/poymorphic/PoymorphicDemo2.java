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
		System.out.println("小米正在打电话");	
	}
}
class RedMi implements Phone{
	@Override
	public void call() {
		System.out.println("红米正在打电话");
	}
}
class Gong{
	public void createPhone(Phone p){
		p.call();
	}
}
