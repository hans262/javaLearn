package homework.p6;
/*
Ҫ���ڲ�����Test14�д���B�Ķ���b�������ó�Ա����methodB

public class Test14 {
	public static void main(String[] args) {
		
	}
}
//����һ���ӿ�
interface InterB {
	void showB();	
}
//Ŀ�꣺���ó�Ա����methodB
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
//		����B�Ķ���b�������ó�Ա����methodB
		new B(new InterB(){
			@Override
			public void showB() {
				System.out.println("showB");
			}
		}).methodB();
	}
}
//����һ���ӿ�
interface InterB {
	public abstract void showB();	
}
//Ŀ�꣺���ó�Ա����methodB
class B {
	InterB b;
	public B(InterB b){
		this.b = b;
	}
	public void methodB(){
		b.showB();
	}
}
