package homework.p6;
/*
1.���嶯����:
	����:
		����
	��Ϊ:
		��ˮ,�Զ���(��ʲô��ȷ��)
2.������Ӿ�ӿ�:
	��Ϊ:
		��Ӿ����
3.���幷��:
	��Ϊ:
		�Է�(�й�ͷ)�� ��Ӿ(����)
4.��������:
	��Ϊ:
		�Է�(��в�)
5.����������:
	��Ϊ:
		�Է�(�Գ���)�� ��Ӿ(��Ӿ)
6.��������Ա��:
	��Ϊ:
		��������:�����Է��ͺ�ˮ
7.���������:

	��������Ա����,����Ա����������������:������,������,��������

Ҫ��: 
	1.������д�����еĳԶ�������
	2.Ҫ����������������Ӿ�ķ���(ʵ����Ӿ�ӿ�)
	3.����Ա���ж���һ������,���������Ƕ�������(����)
		���óԷ�����,�������Ӿ����Ҳ����в���

	4.��ӡ���¸�ʽ�Ľ��:
	
		����ˮ
		���й�ͷ
		���ṷ����Ӿ

		���ܺ�ˮ
		���ܳ�С��
		���ܻ���Ӿ

		���ˮ
		��в�
*/
public class HomeWork3 {
	public static void main(String[] args) {
		Breeder b=new Breeder();
		b.raise(new Dog());
		b.raise(new Frog());
		b.raise(new Yang());
	}
}
class Breeder{
	public void raise(Animal a){
		if(a instanceof Frog){
			a.eat();
			a.drink();
			((Frog) a).swim();
		}else if(a instanceof Dog){
			a.eat();
			a.drink();
			((Dog) a).swim();
		}else if(a instanceof Yang){
			a.eat();
			a.drink();
		}
	}
}
class Frog extends Animal implements Swim{
	@Override
	public void eat() {
		System.out.println("���ܳԳ���");
	}
	@Override
	public void swim() {
		System.out.println("��Ӿ");
	}
	public void drink(){
		System.out.println("���ܺ�ˮ..");
	}
}
class Yang extends Animal {
	@Override
	public void eat() {
		System.out.println("��в�");
	}
	public void drink(){
		System.out.println("���ˮ..");
	}
}
class Dog extends Animal implements Swim{
	@Override
	public void eat() {
		System.out.println("���й�ͷ");
	}
	@Override
	public void swim() {
		System.out.println("����..");
	}
	public void drink(){
		System.out.println("����ˮ..");
	}
}
interface Swim{
	public abstract void swim();
}
abstract class Animal{
	int age;
	public abstract void eat();
	public void drink(){
		System.out.println("��ˮ..");
	}
}
