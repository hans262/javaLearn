package besic.string;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1=" hello world ";
		System.out.println(s1.trim());
		String s2="h,e,l,l,o,w,o,r,l,d";
		String[] arr=s2.split(",");
		for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
	}
}
