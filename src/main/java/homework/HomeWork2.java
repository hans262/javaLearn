package homework;
/*
	1.�����ֻ���
	��Ϊ:��绰,������
	2.����ӿ�IPlay
	��Ϊ:����Ϸ
	3.������ֻ���̳��ֻ���
	��Ϊ:�̳и������Ϊ
	4.�������ֻ��̳��ֻ���ʵ��IPlay�ӿ�
	��Ϊ:�̳и������Ϊ,��д����Ϸ����
	5.���������
	�ڲ������ж���һ�� ���ֻ��ķ���,Ҫ��÷������ܽ������ֻ�����,Ҳ�ܽ������ֻ�����
	�ڸ÷����ڲ����ô�绰,�������Լ����ֻ����е�����Ϸ����
*/
public class HomeWork2 {
	public static void main(String[] args) {
		Test t=new Test();
		t.usePhone(new oldPhone());
	}
}
class Test{
	public void usePhone(Phone p){
		if(p instanceof newPhone){
			p.call();
			p.sendMsg();
			((newPhone) p).palyGame();
		}else if(p instanceof oldPhone){
			p.call();
			p.sendMsg();
		}
	}
}
class oldPhone extends Phone{
	public void call(){
		System.out.println("���ֻ���绰����");
	}
	public void sendMsg(){
		System.out.println("���ֻ������š���");
	}
}
class newPhone extends Phone implements IPlay{
	public void call(){
		System.out.println("���ֻ���绰����");
	}
	public void sendMsg(){
		System.out.println("���ֻ������š���");
	}
	public void palyGame() {
		System.out.println("���ֻ�����Ϸ����");
	}
}
class Phone{
	public void call(){
		System.out.println("��绰����");
	}
	public void sendMsg(){
		System.out.println("�����š���");
	}
}
interface IPlay{
	public abstract void palyGame();
}



