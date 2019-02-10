package collection.foreach;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ForEach增强for循环
 * 
 * ForEach,不能修改集合，否则会发生并发修改异常
 * 
 * 
 * */
public class ForEachDemo {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("hello");
		c.add("world");
		c.add("java");
		for(String val:c){
			System.out.println(val.toUpperCase());
		}
	}
}
