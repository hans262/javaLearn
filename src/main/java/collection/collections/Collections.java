package collection.collections;

import java.util.ArrayList;
import java.util.List;

/*
 * Collection和Collections的区别
 * Collection:所有集合体系的最顶层、包含了集合体系的共性
 * Collections:工具类、服务于collection对象
 * 
 * */
public class Collections {
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();		
//		method4();
//		method5();
//		method6();
//		method7();
		
	}

	private static void method7() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(3);
		//位置调换
		java.util.Collections.swap(list, 0, 1);
		System.out.println(list);
	}

	private static void method6() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(3);
		//排序集合，按照自然顺序进行排序
		java.util.Collections.sort(list);
		System.out.println(list);
	}

	private static void method5() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//随机打乱顺序
		java.util.Collections.shuffle(list);
		System.out.println(list);
	}

	private static void method4() {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//反转集合
		java.util.Collections.reverse(list);
		System.out.println(list);
	}

	private static void method3() {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//覆盖集合，使用指定元素覆盖源集合
		java.util.Collections.fill(list,"android");
		System.out.println(list);
	}

	private static void method2() {
		List<String> src=new ArrayList<String>();
		src.add("hello");
		src.add("world");
		src.add("java");
		//目标集合长度必须大于等于源集合
		List<String> dest=new ArrayList<String>();
		dest.add("");
		dest.add("");
		dest.add("");
		dest.add("android");
		//拷贝集合
		java.util.Collections.copy(dest,src);
		System.out.println(dest);
	}

	private static void method1() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//二分法查找元素、集合必须是有序的
		int index=java.util.Collections.binarySearch(list,4);
		System.out.println(index);
	}
}
