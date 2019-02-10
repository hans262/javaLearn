package besic.string;

public class StringDemo4 {
	public static void main(String[] args) {
		String s1="hellopo";
		System.out.println(s1.length());
		System.out.println(s1.indexOf("o"));//字符串第一次出现的索引
		System.out.println(s1.charAt(1));//获取索引位置的字符串
		System.out.println(s1.substring(0));//截取索引之后的字符串
		System.out.println(s1.substring(1,4));//截取索引到...的字符串（不包括结束索引位置字符串）
	}
}
