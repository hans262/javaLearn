package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//�����޸��쳣�Ĵ���

public class CollectionDemo2 {
	public static void main(String[] args) {
//		method1();
//		method2();
		
		//��ȷ����
		List c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		ListIterator lit=c.listIterator();
		while(lit.hasNext()){
			String s=(String) lit.next();
			if(s.equals("java")){
				lit.add("android");
			}
		}
		System.out.println(c);
	}

	private static void method2() {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		Iterator it=c.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			if(s.equals("java")){
				c.add("android");
				//������Ϊ������ʵ�ڸ������Ͻ��л�ȡ��
				//һ��������ԭ���ϲ���ͬ���׳�����
			}
		}
	}

	private static void method1() {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		if(c.contains("java")){
			c.add("android");
		}
		System.out.println(c);
	}
}
