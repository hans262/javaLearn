package besic.array;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr=new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int[] arr2=arr;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		arr2[0]=10;
		arr2[1]=20;
		arr2[2]=30;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
