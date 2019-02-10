package collection.list;

import java.util.LinkedList;

/*
 * List常用子类
 * 		ArrayList
 * 			底层数组，查询快，增删慢
 * 		LinkedList
 * 			底层链表，查询慢，增删快
 * 
 * 
 * */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("hello");
		link.add("java");
		
		//添加到第一个和最后一个元素
		link.addFirst("android");
		link.addLast("world");
		//得到第一个和最后一个元素
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		//删除第一个和最后一个元素
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		System.out.println(link);
		
	}
}
