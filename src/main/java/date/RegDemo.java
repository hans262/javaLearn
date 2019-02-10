package date;

import java.util.regex.Pattern;

//正则表达式
public class RegDemo {

	public static void main(String[] args) {
		String qq="12345678456";
		//不能0开头，全都为数字，长度5-15位
		boolean flag=qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
		
		String str = "I am noob " +"from runoob.com.";
		String pattern = ".*runoob.*";
		boolean isMatch = Pattern.matches(pattern, str);
		System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
		
	}
}
