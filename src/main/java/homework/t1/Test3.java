package homework.t1;
/*
 * 继承：
 * 子类自动先执行父类构造函数，
 * 父类引用关键词：super
 * 本类引用关键词：this
 * 
 * 匿名对象：可以直接new一个借口或者抽象类，然后实现接口或者重写方法，并执行
 * 
 * final:
 * 修饰属性：不能修改
 * 修饰方法：不能重载
 * 修饰类：不能继承
 * 
 * 抽象类：
 * 抽象类不能创建对象，
 * 抽象类可以有抽象方法，可以有非抽象方法，
 * 抽象类被继承后，必须重写抽象方法
 * 抽象方法没有方法体
 * 
 * 
 * 
 * 
 * */
public class Test3 {
	public static void main(String[] args) {
		C c=new C();
		new D(){
			@Override
			public void eat() {
				System.out.println("eat");
			}
		}.eat();
		
		AA aa=new AA();
		aa.method();
	}
}

final class AA{
	final int a=10;
	public final void method(){
		System.out.println("method");
	}
}
interface D{
	public abstract void eat();
}
abstract class F{
	public abstract void func();
}
class C extends B{
	public C(){
		super();
		System.out.println("C构造");
	}
	public void method(){
		System.out.println("重写method");
	}
}
class B{
	int a=10;
	int b=20;
	public B(){
		System.out.println("B构造");
	}
	public void method(){
		System.out.println("method");
	}
}