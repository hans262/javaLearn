package homework.p6;
/*
Ҫ��:�ڲ�����Test�д���A�Ķ���a�����ó�Ա����methodA(),Ҫ�������ַ�ʽʵ�� 
public class Test {
	public static void main(String[] args) {
				
	}
}
//����ӿ�
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
