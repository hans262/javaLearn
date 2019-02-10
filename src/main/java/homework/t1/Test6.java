package homework.t1;

import java.util.LinkedList;

public class Test6 {
	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("hello");
		link.add("world");
		link.add("java");
		link.addFirst("1");
		link.addLast("2");
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		for(String val:link){
			System.out.print(val+",");
		}
	}
}
