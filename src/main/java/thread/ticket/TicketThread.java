package thread.ticket;

public class TicketThread implements Runnable{
	int tickets=100;//��Ʊ
	
	@Override
	public void run() {
		//��Ʊ
		while(true){
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
