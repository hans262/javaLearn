package besic.string.stringbuilder;

public class StringBuilderDemo2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hedwdllo");
		sb.append("world");
		char[] arr={'a','b','c'};
		sb.append(arr);
		sb.append(true).append(1235);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
