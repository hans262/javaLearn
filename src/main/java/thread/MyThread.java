package thread;
/*
 * Thread
 * 创建线程类
 * 
 * 继承Thread
 * 重写run方法
 * 
 * 	String getName() 返回该线程的名字
 * 	void setName()	设置线程名字
 * 
 * 
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+": "+i);
		}
	}
	
}
