package collection.list;

import java.util.ArrayList;
import java.util.List;

/*
 * 数组：查询快，增删慢
 * 
 * 链表：第一个元素存着下一个元素的地址值，互相链接
 * 组成（地址值、值、下一个地址值）
 * 查询慢、增删快
 * 
 * 栈：压栈
 * 先进后出，
 * 例子（弹夹、封闭胡同）
 * 
 * 队列：
 * 先进先出
 * 例子（排队买票，先排先走）
 * 
 * 
 * List:
 * 
 * 
 * */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//增加，在指定索引增加元素，并把原位置元素向后移动一位
		list.add(0,"hello");
		list.add(1,"java");
		list.add(1,"world");
		//删除,删除索引位置元素，并返回被删除元素
		System.out.println(list.remove(1));
		//修改,修改索引位置元素，并返回原先位置元素
		System.out.println(list.set(0, "android"));
		//查找元素,得到该索引位置元素
		System.out.println(list.get(1));
		
		System.out.println(list);
	}
}
