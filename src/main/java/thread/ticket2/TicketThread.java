package thread.ticket2;

public class TicketThread implements Runnable{
	int tickets=100;//��Ʊ
	Object obj=new Object();
	@Override
	public void run() {
		//��Ʊ
		while(true){
			synchronized(obj){
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
	}
}
