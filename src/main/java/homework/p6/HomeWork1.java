package homework.p6;
/*
���������ʼǱ��࣬ʵ�ֱʼǱ�ʹ��USB��ꡢUSB���̣���ÿ�����ܾ���һ����Ӧ�ĳ�Ա������
1.����USB�ӿ�:
	��������
	�رչ���

2.����ʼǱ���:
	��������
	�ػ�����
	����ʹ��USB�豸�Ĺ���
	Ҫ��:����ʹ�����Ҳ��ʹ�ü���,ʹ��USB�����ڲ����ÿ����͹رչ���

3.���������:
	Ҫ����USB�ӿ�

4.���������:
	Ҫ����USB�ӿ�

5.���������:
	�������Զ���,���ε��ÿ�������,ʹ��USB�豸, �ػ�����

	��ӡЧ������:
		����
		��������USB
		�Ͽ�����USB
		���Ӽ��̵�USB
		�Ͽ����̵�USB
		�ػ�
*/
public class HomeWork1 {
	public static void main(String[] args) {
//		�������Զ���,���ε��ÿ�������,ʹ��USB�豸, �ػ�����
		Computer c=new Computer();
		c.openJ();
		c.closeJ();
		c.useUSB(new keyboard());
	}
}
class Computer{
	public void openJ(){
		System.out.println("����");
	}
	public void closeJ(){
		System.out.println("�ػ�");
	}
	public void useUSB(USB u){
		u.open();
		u.close();
	}
}
class Mouse implements USB{
	@Override
	public void close() {
		System.out.println("�ر�usb");
	}
	@Override
	public void open() {
		System.out.println("����usb");
	}
}
class keyboard implements USB{
	@Override
	public void close() {
		System.out.println("�ر�usb");
	}
	@Override
	public void open() {
		System.out.println("����usb");
	}
}
interface USB{
	public abstract void open();
	public abstract void close();
}

