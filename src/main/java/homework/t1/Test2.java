package homework.t1;
/*
 * ��̬����飺����class�ļ��ļ��ض����أ���ε��ö�����ִֻ��һ�Σ�
 * ������ִ�У��Զ�ִ�б��ྲ̬����飬�����̬����鰴˳��ִ��
 * 
 * ��̬����������ʹ�ö�����.��������
 * 
 * �������飺�����ڹ���ִ�У���ε��ö��ִ�У�ִ��˳�򲻱䣬������캯������һ����������
 * ���󲻵��ò�ִ�й������飬����������鰴˳��ִ�С�
 * 
 * */
public class Test2 {
	static{
		System.out.println("Test2��̬�����");
	}
	{
		System.out.println("Test2��������");
	}
	public static void main(String[] args) {
		A a=new A();
		System.out.println(A.a);
		A a2=new A(25);
		
	}
}

class A{
	static int a=10;
	static{
		System.out.println("A��̬�����1");
	}
	{
		System.out.println("A��������1");
	}
	{
		System.out.println("A��������2");
	}
	public A(){
		System.out.println("A����");
	}
	public A(int age){
		System.out.println("A�вι���");
	}
	public static void methodA(){
		System.out.println("A");
	}
}
