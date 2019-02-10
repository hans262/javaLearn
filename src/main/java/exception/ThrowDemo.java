package exception;
/*
 * �Զ����쳣��
 * 
 * throws:�׳��쳣���ɵ�����������
 * throw:�����쳣������������
 * 
 * */
public class ThrowDemo {
	public static void main(String[] args){
		try {
			checkScore1(100);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		try {
			checkScore2(99);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			checkScore(102);
		}catch(MyException e){
			e.printStackTrace();
		}
	}
	public static void checkScore(int score){
		if(score>100 || score<0) {
			//�׳��Լ����쳣
			throw new MyException("���Գɼ�������Ҫ��");
		}
		System.out.println("���Գɼ�����Ҫ��");
	}
	public static void checkScore1(int score){
		if(score>100 || score<0) {
			//�׳�����ʱ�쳣
			throw new RuntimeException("���Գɼ�������Ҫ��");
		}
		System.out.println("���Գɼ�����Ҫ��");
	}
	public static void checkScore2(int score) throws Exception{
		if(score>100 || score<0) {
			//�׳�����ʱ�쳣
			throw new Exception("���Գɼ�������Ҫ��");
		}
		System.out.println("���Գɼ�����Ҫ��");
	}
}
