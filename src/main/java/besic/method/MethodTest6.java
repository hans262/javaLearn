package besic.method;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		System.out.println("数组最大值为："+getArrMax(arr));
		System.out.println("数组最小值为："+getArrMin(arr));
		System.out.println("数组求和为："+getArrSum(arr));
	}
	public static int getArrMax(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			max=(max>arr[i])?max:arr[i];
		}
		return max;
	}
	public static int getArrMin(int[] arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			min=(min<arr[i])?min:arr[i];
		}
		return min;
	}
	public static int getArrSum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++) sum+=arr[i];
		return sum;
	}
}
