package collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("q");
		array.add("w");
		array.add("e");
		array.add("r");
		array.add("t");
		
		System.out.println(array.get(1));//根据索引查找内容,返回内容
		System.out.println(array.size());//返回长度
//		System.out.println(array.remove("q"));//根据内容删除,返回boolean
//		System.out.println(array.remove(0));//根据内容删除,返回被删除元素
		System.out.println(array.set(0,"b"));//根据索引修改,返回被修改元素
		
		System.out.println(array);
	}
}
