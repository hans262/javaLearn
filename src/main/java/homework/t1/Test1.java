package homework.t1;


public class Test1 {
	public static void main(String[] args){
//		method1();
//		System.out.println(reverse("abcd"));
		
		int[] arr={5,7,1,6,4,9,8,3,2};
		method2(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	//ð������
	public static int[] method2(int[] arr) {
		int k=arr.length;
		while(k>0){
			for(int i=0;i<arr.length-1;i++){//-1��ֹ����Խ��
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			k--;
		}
		return arr;
	}
	//�ݹ�ʵ���ַ�����ת
	public static String reverse(String originStr){
		if(originStr == null || originStr.length() <= 1)
			return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
	//��ӡ����
	public static void method1() {
		for(int x=5,y=0;x>0 && y<5;x--,y++){
			for(int j=0;j<y;j++){
				System.out.print(" ");
			}
			for(int i=0;i<x;i++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
