package homework.file;

import java.util.Random;

/*1.������������Ϊ10�����飬������Ԫ��Ϊ������ɵġ����ظ��� 1-100֮���������
2.����һ�������������������飬�����н��������鲻ͬ��Ԫ��ƴ�ӳ�һ���ַ��������ҽ����ַ����Լ��ַ����ĳ������������̨�ϣ�
	���û�������"�Բ����������������Ԫ�ؾ���ͬ"*/
public class Test7 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int[] arr2=new int[10];
		Random ran=new Random();
		for(int i=0;i<arr.length;i++) arr[i]=ran.nextInt(100);
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+",");
		System.out.print("]");
		System.out.println();
	}
}
