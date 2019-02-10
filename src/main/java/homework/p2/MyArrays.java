package homework.p2;

import java.util.ArrayList;

//1.public static void reverse(ArrayList<Integer> list);
//����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
//Ҫ�󣺶�list���϶����е�Ԫ�ؽ��з�ת(��һ�������һ���������ڶ����͵����ڶ����������������͵�����������
//
//��...)
//2.public static Integer max(ArrayList<Integer> list);
//����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
//Ҫ�����list���϶����е����ֵ������
//3.public static Integer min(ArrayList<Integer> list);
//����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
//Ҫ�����list���϶����е���Сֵ������
//4.public static int indexOf(ArrayList<Integer> list,Integer i);
//����ArrayList<Integer> list:Ҫ���в����ļ��϶���
//����Integer i:��Ҫ�ڼ����в��ҵ�Ԫ��
//Ҫ�����Ԫ��i��list�����е�һ�γ��ֵ����������û�з���-1
//5.public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue);
//����ArrayList<Integer> list:Ҫ���в����ļ��϶���
//����Integer oldValue:��Ҫ���滻����ԭֵ
//����Integer newValue���滻�����ֵ
//Ҫ�󣺽�list�����е�����ֵΪoldValue��Ԫ���滻ΪnewValue
public class MyArrays {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(6);
		list.add(2);
		list.add(9);
		list.add(4);
		list.add(2);
//		reverse(list);
//		System.out.println(max(list));
//		System.out.println(min(list));
//		System.out.println(indexOf(list,0));
		replaceAll(list,2,5);
	}
	public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue){
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(oldValue)){
				list.set(i,newValue);
			}
		}
		System.out.println(list);
	}
	public static int indexOf(ArrayList<Integer> list,Integer i){
		for(int x=0;x<list.size();x++){
			if(list.get(x).equals(i)){
				return x;
			}
		}
		return -1;
	}
	public static Integer min(ArrayList<Integer> list){
		Integer min=list.get(0);
		for(int i=1;i<list.size();i++){
			if(list.get(i)<min) min=list.get(i);
		}
		return min;
	}
	public static Integer max(ArrayList<Integer> list){
		Integer max=list.get(0);
		for(int i=1;i<list.size();i++){
			if(list.get(i)>max) max=list.get(i);
		}
		return max;
	}
	public static void reverse(ArrayList<Integer> list){
		for(int start=0,end=list.size()-1;start<=end;start++,end--){
			int temp=list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
		}
		System.out.println(list);
	}
}
