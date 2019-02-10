package thread.ticket3;

import thread.ticket3.TicketThread;

/*
 * 
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
