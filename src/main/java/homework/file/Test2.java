package homework.file;

import java.util.Scanner;
/*1.����¼��6��int���͵����ݴ�������arr��
2.��arr�����е����ݷ�ת
3.����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
4.����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
5.��ӡ���յ�����(ʵ����1-4��֮�������)
6.�磺�û������6��int����Ϊ[1,2,3,4,5,6],�������Ľ��Ϊ[6, 5, 4, 1, 2, 3]*/
public class Test2 {
	public static void main(String[] args) {
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("�����"+(i+1)+"������");
			arr[i]=sc.nextInt();
		}
		printArr(arr);
		reversal(arr);
		
		for(int i=3;i<arr.length;i++){
			if(i%2==1){
				int temp=arr[i];
				arr[i]=arr[i-2];
				arr[i-2]=temp;
			}
		}
		printArr(arr);
	}
	public static void reversal(int[] arr) {
		for(int s=0,e=arr.length-1;s<=e;s++,e--){
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
		}
	}
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
		System.out.println("]");
	}
}
