package homework.p6;
/*
1.�ӿ�IPlay����һ������playGame()���ڲ���������ε��ø÷�����
Ҫ��1.��������ʵ�ֽӿڵķ�ʽʵ�� 
Ҫ��2:�������ڲ���ʵ��

2.һ��������Fun����һ�����󷽷� fun() , �ڲ���������ε��ø÷���?
Ҫ��1.��������̳г�����ķ�ʽʵ��
Ҫ��2:�������ڲ���ʵ��
*/
public class HomeWork2 {
	public static void main(String[] args) {
		//�ڲ���ʵ�ֽӿ�
		new IPlay(){
			@Override
			public void playGame() {
				System.out.println("����Ϸ");
			}
        }.playGame();
        
        //�ڲ���̳и���
        new Fun(){
			@Override
			public void fun() {
				System.out.println("fun");
			}
        }.fun();
	}
}
class kid extends Fun{
	@Override
	public void fun() {
		System.out.println("fun");
	}
}
abstract class Fun{
	public abstract void fun();
}
interface IPlay{
	public abstract void playGame();
}


