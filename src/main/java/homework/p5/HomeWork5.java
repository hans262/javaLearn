package homework.p5;
/*
1.���嶯���ࣺ
��Ϊ��
	��У�û�о���ĺ����Ϊ
	�Է�:û�о���ĳԷ���Ϊ
2.���弩���ӿ�
��Ϊ: 
	����
3.���弩����:Ȯ��һ��
��Ϊ��
	���:������
	�Է�:���й�ͷ
	����:�ñ�����ⶾ
4.���������:
ʹ�ö�̬����ʽ��������������,���ü��������ͺ�з���
*/
public class HomeWork5 {
	public static void main(String[] args) {
		Animal a=new JdDog();
		((JdDog)a).jidu();//ǿת����
		a.speak();
		a.eat();
	}
}
abstract class Animal{
	public abstract void speak();
	public abstract void eat();
}
interface JD{
	public abstract void jidu();
}
class JdDog extends Animal implements JD{
	@Override
	public void eat() {
		System.out.println("���й�ͷ");
	}
	@Override
	public void speak() {
		System.out.println("������");
	}
	public void jidu() {
		System.out.println("�ñ�����ⶾ");
	}
}

