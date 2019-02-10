package thread;
/*
 * 多线程的实现方式
 * 	方式一：一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。接下来可以分配并启动该子类的实例。
 * 
 * CPU执行程序的顺序
 * 	随机性
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//创建线程实例1
		MyThread mt=new MyThread();
		mt.setName("张三");
		//启动线程1
		mt.start();
		
		//创建线程实例2
		MyThread mt2=new MyThread();
		mt2.setName("李四");
		//启动线程2
		mt2.start();
	}
}
