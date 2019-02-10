package besic.string.stringbuilder;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		String str=getToString(arr);
		System.out.println(str);
	}
	public static String getToString(int[] arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1) sb.append(arr[i]);
			else sb.append(arr[i]).append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}
