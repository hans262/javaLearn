package thread;
/*
 * ���̵߳�ʵ�ַ�ʽ2
 * 	��һ�ַ���������ʵ�� Runnable �ӿڵ��ࡣ
 * ����Ȼ��ʵ�� run ������Ȼ����Է�������ʵ����
 * �ڴ��� Thread ʱ��Ϊһ�����������ݲ�������
 * 
 * 	Thread(Runnable target)
 * 	static Thread currentThread():���ص�ǰ�̶߳���
 * 
 * 	Ϊʲô�����ַ�����
 * 	�ڶ��ַ������߳��໹���Լ̳ж���
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		MyThread2 mt=new MyThread2(100);
		//�����߳�ʵ��
		Thread t=new Thread(mt);
		t.setName("����");
		//�����߳�
		t.start();
		
		//�����߳�ʵ��
		Thread t2=new Thread(mt);
		t2.setName("����");
		//�����߳�
		t2.start();
		
	}

	public static void demo1() {
		//�����߳�ʵ��
		MyThread2 mt=new MyThread2(100);
		Thread t=new Thread(mt);
		t.setName("����");
		//�����߳�
		t.start();
		
		//�����߳�ʵ��
		MyThread2 mt2=new MyThread2(200);
		Thread t2=new Thread(mt2);
		t2.setName("����");
		//�����߳�
		t2.start();
	}
}
