package object.interface_;
/*
 * �ӿ� interface �ȳ����໹����
 * �ӿ���ֻ���г��󷽷���ֻ���г���
 * ֻ��ʹ�� public abstract ���η���
 * ֻ��ʹ��public static final���γ���
 * 
 * implements ��ӿڷ�����ϵ
 * ������д�ӿ����еĳ��󷽷�
 * 
 * ������Ĺ�ϵ���̳й�ϵ����һ�̳У����̳�
 * ����ӿڵĹ�ϵ��ʵ�ֹ�ϵ����ʵ�֣�һ�������ʵ�ֶ���ӿ�
 * �ӿ���ӿڵĹ�ϵ���̳й�ϵ����̳�
 * 
 * �ӿڵ��ŵ㣺�����˳��������ԣ���ʵ��ģ�黯������
 * �ȶ���ӿڣ�����ʵ�ֽӿڣ���߿���Ч��
 * �ӿ���Ϊ��ʵ�֣���Ϊ�˽��java����ĵ�һ�̳У��ӿ��ǿ��Զ�̳е�
 * 
 * */
public class InterfaceDemo {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		System.out.println(c.age);
		c.funcA();
		c.funcB();
		c.funcC();
	}
}

interface InterA{
	public abstract void funcA();
}
interface InterB{
	public abstract void funcB();
}
interface InterC{
	public abstract void funcC();
}
interface Animal extends InterA,InterB{
	public static final int age=10;
	public abstract void eat();
}
class Cat implements Animal,InterC{
	@Override
	public void eat() {
		System.out.println("è����");
	}
	@Override
	public void funcA() {
		System.out.println("����ʵ��InterA�ӿ��еĳ��󷽷�");
	}
	@Override
	public void funcB() {
		System.out.println("����ʵ��InterB�ӿ��еĳ��󷽷�");
	}
	@Override
	public void funcC() {
		System.out.println("����ʵ��InterC�ӿ��еĳ��󷽷�");
	}
}


