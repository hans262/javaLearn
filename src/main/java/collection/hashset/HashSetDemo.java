package collection.hashset;

import java.util.HashSet;
/*
 * HashSet
 * 	����ġ��������ظ���Ԫ��Ψһ
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
