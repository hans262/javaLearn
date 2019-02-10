package tool.sort;
//¶þ·Ö·¨ÅÅÐò

public class Demo_1 {
	public static void main(String[] args) {
		int[] arr={8,6,4,5,1,9,3,0,2,7};
		getArray(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	public static int[] getArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			int minValue=arr[x];
			int minIndex=x;
			for(int i=(x+1);i<arr.length;i++){
				if(arr[i]<minValue){
					minValue=arr[i];
					minIndex=i;
				}
			}
			int temp=arr[x];
			arr[x]=minValue;
			arr[minIndex]=temp;
		}
		return arr;
	}
}
