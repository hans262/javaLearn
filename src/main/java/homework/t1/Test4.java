package homework.t1;
/*
 * 接口：
 * 比抽象类还抽象，里面全是抽象方法,只能有抽象方法
 * 
 * 多态：
 * 父类引用子类,只能调用父类拥有的方法，或父接口实现的方法
 * 需要调用子类方法，需要向下转型
 * 
 * 
 * */
public class Test4 {
	public static void main(String[] args) {
		QQ q=new PP();//向上转型
		q.c();
		((PP)q).a();//向下转型
		
	}
}

class PP extends QQ implements OO{
	@Override
	public void a() {
		System.out.println("a");
	}
	@Override
	public void b() {
		System.out.println("b");
	}
}
class QQ{
	public void c(){
		System.out.println("c");
	}
}
interface OO{
	public abstract void a();
	public abstract void b();
}
