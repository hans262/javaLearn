package besic.string.stringbuilder;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello").append(true);
		String str=sb.toString();//ת�ַ���
		System.out.println(str);
		
		StringBuilder sb2=new StringBuilder(str);//תbuilder
		
		System.out.println(sb2);
	}
}
