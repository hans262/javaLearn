package thread.ticket2;

import thread.ticket2.TicketThread;

/*
 * 
 * 售票问题
 * 多线程操作同一个数据，就容易出现错误
 * 问题出现的原因
 * 	多个线程
 * 	多个线程共享数据
 * 	多个线程并发访问共享数据
 * 
 * 解决案例-线程加锁
 * 	有些数据是不是被并发访问，采用加锁
 * 	火车门厕所，红灯代表有人，绿灯代表没人，可以使用
 * 
 * 
 * synchronized:同步(锁)，可以修饰代码块和方法，被修饰的代码块一旦被某个线程访问，则直接锁住，其他的线程将无法访问
 * 
 * 同步代码块：
 * 	synchronized(锁对象){...}
 * 	注意锁对象需要被所有的线程所共享
 * 
 * 同步：安全性高，效率底
 * 非同步：安全性底，效率高
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
