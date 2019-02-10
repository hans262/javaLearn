package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//并发修改异常的处理

public class CollectionDemo2 {
	public static void main(String[] args) {
//		method1();
//		method2();
		
		//正确做法
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
				//报错！因为迭代器实在复制提上进行获取，
				//一旦发现与原集合不相同就抛出错误
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
