package thread.ticket;
/*
 * 模拟火车站售票
 * 
 * 	分析
 * 		需要火车票的总数，每卖出一张减少一张
 * 		当票数小于0的时候，停止买票，
 * 		使用多线程模拟多个窗口售票
 * 		票卖完，火车站也一直开着
 * 
 * 	static void sleep(long millis) : 让当前线程睡一会
 * 
 */
public class TicketDemo {
	public static void main(String[] args) {
		//创建窗口实现类
		TicketThread tt=new TicketThread();
		//创建窗口线程
		Thread t1=new Thread(tt);
		t1.setName("窗口1");
		Thread t2=new Thread(tt);
		t2.setName("窗口2");
		Thread t3=new Thread(tt);
		t3.setName("窗口3");
		
		//开始售票
		t1.start();
		t2.start();
		t3.start();
		
	}
}
