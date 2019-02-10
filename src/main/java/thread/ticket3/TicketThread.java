package thread.ticket3;
/*
 * synchronized
 * 同步方法:synchronized修饰的方法
 * 一旦被一个线程访问，全部锁死，其他线程无法访问
 * 
 * 	非静态同步方法的锁对象是this
 * 	静态同步方法的锁对象是:当前类的字节码对象
 * 
 */
public class TicketThread implements Runnable{
	static int tickets=100;//火车票
	@Override
	public void run() {
		while(true){
			Sell2();
		}
	}
	//直接同步加锁修饰方法
	public synchronized void Sell(){
		if(tickets>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":余票 "+tickets--);
		}
	}
	public static synchronized void Sell2(){
		if(tickets>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":余票 "+tickets--);
		}
	}
}
