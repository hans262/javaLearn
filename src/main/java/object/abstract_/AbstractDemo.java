package object.abstract_;
/*
 * ���󷽷������ڳ������У��������඼��������
 * �̳г����࣬��������г��󷽷���������д������ĳ��󷽷�
 * �����಻�ܴ�������
 * �������п�ӵ�зǳ��󷽷�
 * ����������й��췽��
 * 
 * �����಻�ܺ�final��private�ؼ��ʹ���
 * 
 * */
public class AbstractDemo {
	public static void main(String[] args) {
		Cat c=new Cat();
		
	}
}
abstract class Animal{
	public Animal(){
		System.out.println("������");
	}
	public abstract void eat();
}

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("è����");
	}
}
class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("����ʺ");
	}
}
