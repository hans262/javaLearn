package thread.ticket2;

public class TicketThread implements Runnable{
	int tickets=100;//ª≥µ∆±
	Object obj=new Object();
	@Override
	public void run() {
		//¬Ù∆±
		while(true){
			synchronized(obj){
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
}
