package thread.ticket3;
/*
 * synchronized
 * ͬ������:synchronized���εķ���
 * һ����һ���̷߳��ʣ�ȫ�������������߳��޷�����
 * 
 * 	�Ǿ�̬ͬ����������������this
 * 	��̬ͬ����������������:��ǰ����ֽ������
 * 
 */
public class TicketThread implements Runnable{
	static int tickets=100;//��Ʊ
	@Override
	public void run() {
		while(true){
			Sell2();
		}
	}
	//ֱ��ͬ���������η���
	public synchronized void Sell(){
		if(tickets>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":��Ʊ "+tickets--);
		}
	}
	public static synchronized void Sell2(){
		if(tickets>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":��Ʊ "+tickets--);
		}
	}
}
