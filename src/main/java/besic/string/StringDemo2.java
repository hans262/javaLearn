package besic.string;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		String s3="hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));//区分大小写
		System.out.println(s1.equalsIgnoreCase(s2));//不区分大小写
		
		System.out.println(s1.startsWith("e"));
		System.out.println(s1.endsWith("o"));
	}
}
