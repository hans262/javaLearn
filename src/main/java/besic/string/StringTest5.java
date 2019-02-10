package besic.string;

public class StringTest5 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,};
		String s=getToString(arr);
		System.out.println(s);
	}
	public static String getToString(int[] arr) {
		String s="";
		for(int i=0;i<arr.length;i++){
			s+=arr[i];
		}
		return s;
	}
}
