package collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array= new ArrayList();
		array.add("hello");
		array.add("world");
		array.add(1,"shab");//������λ�����
		System.out.println(array);
	}
}
