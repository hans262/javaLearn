package besic.string.stringbuilder;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello").append(true);
		String str=sb.toString();//×ª×Ö·û´®
		System.out.println(str);
		
		StringBuilder sb2=new StringBuilder(str);//×ªbuilder
		
		System.out.println(sb2);
	}
}
