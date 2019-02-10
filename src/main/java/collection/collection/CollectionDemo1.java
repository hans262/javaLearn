package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * Collection是一个接口
 * 不能创建对象，只能使用多态来实例化
 * 
 * 
 * */
public class CollectionDemo1 {
	public static void main(String[] args) {
//		method1();
		
		//遍历集合
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		//转化成迭代器，迭代器提供遍历方法
		Iterator it=c.iterator();
		while(it.hasNext()){//判断是否拥有下一个元素
			System.out.println(it.next());//获取下一个元素
		}
		
	}

	private static void method1() {
		Collection c=new ArrayList();
		//添加，返回值boolean
		System.out.println("添加元素："+c.add("hello"));
		System.out.println("添加元素："+c.add("world"));
		//清空
//		c.clear();
		//判断是否包含元素
		System.out.println("是否包含元素："+c.contains("hello"));
		//判断是否为空
		System.out.println("是否为空："+c.isEmpty());
		//删除元素
//		System.out.println("删除元素："+c.remove("hello"));
		//获取长度
		System.out.println("获取长度："+c.size());
		//遍历集合
		Object[] o=c.toArray();
		System.out.print("遍历数组：");
		for(int i=0;i<o.length;i++){
			System.out.print(o[i]+",");
		}
		System.out.println();
		
		System.out.println("打印集合："+c);
	}
}
