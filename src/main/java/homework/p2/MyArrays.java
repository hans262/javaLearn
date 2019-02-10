package homework.p2;

import java.util.ArrayList;

//1.public static void reverse(ArrayList<Integer> list);
//参数ArrayList<Integer> list:要进行操作的集合对象		
//要求：对list集合对象中的元素进行反转(第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交
//
//换...)
//2.public static Integer max(ArrayList<Integer> list);
//参数ArrayList<Integer> list:要进行操作的集合对象		
//要求：求出list集合对象中的最大值并返回
//3.public static Integer min(ArrayList<Integer> list);
//参数ArrayList<Integer> list:要进行操作的集合对象		
//要求：求出list集合对象中的最小值并返回
//4.public static int indexOf(ArrayList<Integer> list,Integer i);
//参数ArrayList<Integer> list:要进行操作的集合对象
//参数Integer i:需要在集合中查找的元素
//要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
//5.public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue);
//参数ArrayList<Integer> list:要进行操作的集合对象
//参数Integer oldValue:需要被替换掉的原值
//参数Integer newValue：替换后的新值
//要求：将list集合中的所有值为oldValue的元素替换为newValue
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
