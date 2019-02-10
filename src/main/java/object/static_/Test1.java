package object.static_;

public class Test1 {
	public static void main(String[] args) {
//		System.out.println((int)(Math.random()*10));
		int[] arr={1,2,8,5,6,9,50,67,45,20};
		System.out.println(Arrays.getMax(arr));
		System.out.println(Arrays.getIndexOf(arr,3));
	}
}
