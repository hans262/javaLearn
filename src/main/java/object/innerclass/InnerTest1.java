package object.innerclass;
//1.���嶯����
//��Ϊ:
//	eat����(�޾�����Ϊ,��ͬ����ԵĲ�һ��)
//
//2.���幷��̳ж�����
//��Ϊ:
//	eat����(�й�ͷ),���ҷ���
//
//3.����è��̳ж�����
//��Ϊ:
//	eat����(����),ץ���󷽷�
//
//4.������:
//����һ������,Ҫ��÷������ܽ��չ�����Ҳ�ܽ���è����
//�ڸ÷������ڲ�����eat()����,���ҵ��ù���è�����з���
public class InnerTest1 {
	public static void main(String[] args) {
		method(new Cat());
	}
	public static void  method(Animals a){
		if(a instanceof Dog){
			a.eat();
			((Dog) a).lookHome();
		}else if(a instanceof Cat){
			a.eat();
			((Cat) a).catchMouse();
		}
	}
}
class Cat implements Animals{
	@Override
	public void eat() {
		System.out.println("è����");
		
	}
	public void catchMouse(){
		System.out.println("èץ����");
	}
	
}
class Dog implements Animals{
	@Override
	public void eat() {
		System.out.println("���й�ͷ");
	}
	public void lookHome(){
		System.out.println("������");
	}
	
}
interface Animals{
	public abstract void eat();
}


