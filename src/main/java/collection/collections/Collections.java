package collection.collections;

import java.util.ArrayList;
import java.util.List;

/*
 * Collection��Collections������
 * Collection:���м�����ϵ����㡢�����˼�����ϵ�Ĺ���
 * Collections:�����ࡢ������collection����
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
		//λ�õ���
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
		//���򼯺ϣ�������Ȼ˳���������
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
		//�������˳��
		java.util.Collections.shuffle(list);
		System.out.println(list);
	}

	private static void method4() {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//��ת����
		java.util.Collections.reverse(list);
		System.out.println(list);
	}

	private static void method3() {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//���Ǽ��ϣ�ʹ��ָ��Ԫ�ظ���Դ����
		java.util.Collections.fill(list,"android");
		System.out.println(list);
	}

	private static void method2() {
		List<String> src=new ArrayList<String>();
		src.add("hello");
		src.add("world");
		src.add("java");
		//Ŀ�꼯�ϳ��ȱ�����ڵ���Դ����
		List<String> dest=new ArrayList<String>();
		dest.add("");
		dest.add("");
		dest.add("");
		dest.add("android");
		//��������
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
		//���ַ�����Ԫ�ء����ϱ����������
		int index=java.util.Collections.binarySearch(list,4);
		System.out.println(index);
	}
}
