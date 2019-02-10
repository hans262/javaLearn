package collection.hashset;

import java.util.HashSet;
/*
 * HashSet
 * 	无序的、不允许重复、元素唯一
 * 
 * 	
 * */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("hello");
		set.add("world");
		System.out.println(set.add("java"));
		System.out.println(set.add("java"));//false
		
		for(String s:set) {
			System.out.println(s);
		}
		
		
	}
}
