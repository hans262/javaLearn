package thread.ticket2;

import thread.ticket2.TicketThread;

/*
 * 
 * ��Ʊ����
 * ���̲߳���ͬһ�����ݣ������׳��ִ���
 * ������ֵ�ԭ��
 * 	����߳�
 * 	����̹߳�������
 * 	����̲߳������ʹ�������
 * 
 * �������-�̼߳���
 * 	��Щ�����ǲ��Ǳ��������ʣ����ü���
 * 	���Ų�������ƴ������ˣ��̵ƴ���û�ˣ�����ʹ��
 * 
 * 
 * synchronized:ͬ��(��)���������δ����ͷ����������εĴ����һ����ĳ���̷߳��ʣ���ֱ����ס���������߳̽��޷�����
 * 
 * ͬ������飺
 * 	synchronized(������){...}
 * 	ע����������Ҫ�����е��߳�������
 * 
 * ͬ������ȫ�Ըߣ�Ч�ʵ�
 * ��ͬ������ȫ�Եף�Ч�ʸ�
 * 
 */
public class TicketDemo {
	public static void main(String[] args) {
		//��������ʵ����
		TicketThread tt=new TicketThread();
		//���������߳�
		Thread t1=new Thread(tt);
		t1.setName("����1");
		Thread t2=new Thread(tt);
		t2.setName("����2");
		Thread t3=new Thread(tt);
		t3.setName("����3");
		
		//��ʼ��Ʊ
		t1.start();
		t2.start();
		t3.start();
	}
}
