package date;
/*
 * �Զ�װ�䡢�Զ����䣬JDK1.5������
 * ������Զ�����ת�����ͣ��򻯲���
 * 
 * int���ַ����Ļ�ת
 * 
 * */
public class IntegerDemo {
	public static void main(String[] args) {
//		method1();
		//�Զ�װ��
		Integer a=10; //�൱��Integer a=new Integer(10);
		//�Զ�����
		int b=a; //�൱��int b=a.intValue();

	}

	private static void method1() {
//		Integer integer=new Integer(52);
		//�ַ���תint
		int i=Integer.parseInt("20");
		System.out.println(i);
		
		//intת�ַ���
		String s=Integer.toString(25);
		System.out.println(s);
	}
}
