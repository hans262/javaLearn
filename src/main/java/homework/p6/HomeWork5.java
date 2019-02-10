package homework.p6;
/*
要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 
public class Test {
	public static void main(String[] args) {
				
	}
}
//定义接口
interface InterA {
	void showA();	
}
class A {
	public void methodA(InterA a) {
		a.showA();		
	}	
}
*/
public class HomeWork5 {
	public static void main(String[] args) {
		new A().methodA(
			new InterA(){
				@Override
				public void showA() {
					System.out.println("showA");
				}
			}
		);
	}
}

interface InterA {
	public abstract void showA();
}
class A {
	public void methodA(InterA a) {
		a.showA();
	}
}
