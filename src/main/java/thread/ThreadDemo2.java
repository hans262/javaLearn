package thread;
/*
 * ���̵߳�ʵ�ַ�ʽ
 * 	��ʽһ��һ�ַ����ǽ�������Ϊ Thread �����ࡣ������Ӧ��д Thread ��� run ���������������Է��䲢�����������ʵ����
 * 
 * CPUִ�г����˳��
 * 	�����
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//�����߳�ʵ��1
		MyThread mt=new MyThread();
		mt.setName("����");
		//�����߳�1
		mt.start();
		
		//�����߳�ʵ��2
		MyThread mt2=new MyThread();
		mt2.setName("����");
		//�����߳�2
		mt2.start();
	}
}
