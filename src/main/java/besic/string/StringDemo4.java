package besic.string;

public class StringDemo4 {
	public static void main(String[] args) {
		String s1="hellopo";
		System.out.println(s1.length());
		System.out.println(s1.indexOf("o"));//�ַ�����һ�γ��ֵ�����
		System.out.println(s1.charAt(1));//��ȡ����λ�õ��ַ���
		System.out.println(s1.substring(0));//��ȡ����֮����ַ���
		System.out.println(s1.substring(1,4));//��ȡ������...���ַ�������������������λ���ַ�����
	}
}
