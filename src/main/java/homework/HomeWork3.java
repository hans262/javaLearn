package homework;
/*
1.���嶯����
��Ϊ:eat����(�޾�����Ϊ,��ͬ����ԵĲ�һ��)
2.���幷��̳ж�����
��Ϊ:eat����(�й�ͷ),���ҷ���
3.����è��̳ж�����
��Ϊ:eat����(����),ץ���󷽷�
4.������:
����һ������,Ҫ��÷������ܽ��չ�����Ҳ�ܽ���è����
�ڸ÷������ڲ�����eat()����,���ҵ��ù���è�����з���
*/
public class HomeWork3 {
	public static void main(String[] args) {
		test(new Cat());
	}
	public static void test(Animal a){
		if(a instanceof Dog){
			a.eat();
			((Dog) a).seeHome();
		}else if(a instanceof Cat){
			a.eat();
			((Cat) a).playMouse();
		}
	}
}
abstract class Animal{
	public abstract void eat();
}
class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("è����");
	}
	public void playMouse(){
		System.out.println("ץ����");
	}
}
class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("���й�ͷ");
	}
	public void seeHome(){
		System.out.println("������");
	}
}


