package homework.t1;
/*
 * �̳У�
 * �����Զ���ִ�и��๹�캯����
 * �������ùؼ��ʣ�super
 * �������ùؼ��ʣ�this
 * 
 * �������󣺿���ֱ��newһ����ڻ��߳����࣬Ȼ��ʵ�ֽӿڻ�����д��������ִ��
 * 
 * final:
 * �������ԣ������޸�
 * ���η�������������
 * �����ࣺ���ܼ̳�
 * 
 * �����ࣺ
 * �����಻�ܴ�������
 * ����������г��󷽷��������зǳ��󷽷���
 * �����౻�̳к󣬱�����д���󷽷�
 * ���󷽷�û�з�����
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
		System.out.println("C����");
	}
	public void method(){
		System.out.println("��дmethod");
	}
}
class B{
	int a=10;
	int b=20;
	public B(){
		System.out.println("B����");
	}
	public void method(){
		System.out.println("method");
	}
}