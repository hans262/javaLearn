package object.poymorphic;
/*
 * ��̬��
 * �Ӹ���̳й�ϵ
 * ��������д
 * ��������ָ������Ķ���
 * 
 * ��̬��Ա�ص㣺
 * ��Ա���� ����ʱ����ߣ�����ʱ�����
 * ��Ա���� ����ʱ����ߣ�����ʱ���ұ�
 * ��̬����  ����ʱ����ߣ�����ʱ�����
 * 
 * ����ת�ͣ�
 * ֻ�ܵ��ø������еĳ�Ա�����������������д���͵���������д��ķ���
 * ������Ϊ���ܼ̳У����Ա���ָ�����еı���
 * 
 * ����ת��
 * ǿת
 * �������ܵ�������ķ���
 * 
 * 
 * */
public class PoymorphicDemo {
	public static void main(String[] args) {
		Animal a=new Cat();
		a.eat();
		System.out.println(a.a);
		a.func();//ʹ�ñ���ȥ���þ�̬�������൱���ñ�����������ȥ���÷���
		
		Cat c=(Cat)a;//����ǿ��ת��
		c.kid();
		System.out.println(c.a);
	}
}
class Animal{
	int a=10;
	public void op(){
		System.out.println("op");
	}
	public void eat(){
		System.out.println("�ԡ�����");
	}
	public static void func(){
		System.out.println("���Ǹ��ྲ̬����");
	}
}
class Cat extends Animal{
	int a=20;
	public void eat(){
		System.out.println("è����");
	}
	public static void func(){
		System.out.println("�������ྲ̬����");
	}
	public void kid(){
		System.out.println("kid");
	}
}
