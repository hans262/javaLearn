package thread.ticket3;

import thread.ticket3.TicketThread;

/*
 * 
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
