package thread.ticket;
/*
 * ģ���վ��Ʊ
 * 
 * 	����
 * 		��Ҫ��Ʊ��������ÿ����һ�ż���һ��
 * 		��Ʊ��С��0��ʱ��ֹͣ��Ʊ��
 * 		ʹ�ö��߳�ģ����������Ʊ
 * 		Ʊ���꣬��վҲһֱ����
 * 
 * 	static void sleep(long millis) : �õ�ǰ�߳�˯һ��
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
