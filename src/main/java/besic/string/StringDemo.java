package besic.string;

public class StringDemo {
	public static void main(String[] args) {
		String s=new String("hello");
		char[] chr={'h','e','l','l','y',};
		String s1=new String(chr);
		
		String s2=new String(chr,0,2);
		System.out.println(s2);
	}
}
