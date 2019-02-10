package object.static_;

public class Arrays {
	private Arrays(){}
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max) max=arr[i];
		}
		return max;
	}
	public static int getIndexOf(int[] arr,int x) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x) return i;
		}
		return -1;
	}
}
