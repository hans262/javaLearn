package date;

import java.util.regex.Pattern;

//������ʽ
public class RegDemo {

	public static void main(String[] args) {
		String qq="12345678456";
		//����0��ͷ��ȫ��Ϊ���֣�����5-15λ
		boolean flag=qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
		
		String str = "I am noob " +"from runoob.com.";
		String pattern = ".*runoob.*";
		boolean isMatch = Pattern.matches(pattern, str);
		System.out.println("�ַ������Ƿ������ 'runoob' ���ַ���? " + isMatch);
		
	}
}
