package tool.sort;
/*
 * �ݹ�
 * 
 * �׳��㷨��
 * 		n!=n*(n-1)!
 * 
 * �ݹ��ע�⣺
 * 		���ɶ��ã��ڴ�й¶
 * 		����Ҫ�г��ڣ��ڴ�й¶
 * 
 * */
public class Demo_2 {
	public static void main(String[] args) {
		int result=JC(5);
		System.out.println(result);
	}
	public static int JC(int n) {
		if(n==1) return 1;
		return n*JC(n-1);
	}
}
