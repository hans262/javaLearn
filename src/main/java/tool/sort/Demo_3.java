package tool.sort;
/*
 * 쳲�����������
 * 		�е�һ�����ӣ���������������ÿ������һ�����ӣ�
 * 		С���ӳ�������������Ҳ����һ�����ӣ�������Ӷ���������20�����ж��ٶ�����
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 
 * �ݹ��㷨��number=f(n-1)+f(n-2)
 * */
public class Demo_3 {
	public static void main(String[] args) {
		int num=getNum(20);
		System.out.println(num);
	}
	public static int getNum(int m) {
		if(m==1) {
			return 1;
		}else if(m==2) {
			return 1;
		}else {
			return getNum(m-1)+getNum(m-2);
		}
	}
}
