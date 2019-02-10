package homework.p6;
/*
要求：在测试类Test14中创建B的对象b，并调用成员方法methodB

public class Test14 {
	public static void main(String[] args) {
		
	}
}
//定义一个接口
interface InterB {
	void showB();	
}
//目标：调用成员方法methodB
class B {
	InterB b;
	public B(InterB b){
		this.b = b;
	}
	public void methodB(){
		b.showB();		
	}
}
*/
public class HomeWork6 {
	public static void main(String[] args) {
//		创建B的对象b，并调用成员方法methodB
		new B(new InterB(){
			@Override
			public void showB() {
				System.out.println("showB");
			}
		}).methodB();
	}
}
//定义一个接口
interface InterB {
	public abstract void showB();	
}
//目标：调用成员方法methodB
class B {
	InterB b;
	public B(InterB b){
		this.b = b;
	}
	public void methodB(){
		b.showB();
	}
}
