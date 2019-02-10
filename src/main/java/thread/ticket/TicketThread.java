package thread.ticket;

public class TicketThread implements Runnable{
	int tickets=100;//ª≥µ∆±
	
	@Override
	public void run() {
		//¬Ù∆±
		while(true){
			if(tickets>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+":”‡∆± "+tickets--);
			}
		}
	}

}
