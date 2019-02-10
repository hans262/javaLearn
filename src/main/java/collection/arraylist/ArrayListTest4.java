package collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest4 {
	public static void main(String[] args) {
		ArrayList<Student> array=new ArrayList<Student>();
		array.add(new Student("ÁÖÇàÏ¼","28"));
		array.add(new Student("ÕÅÂüÓñ","25"));
		array.add(new Student("ÁõÒà·Æ","29"));
		array.add(new Student("·¶±ù±ù","30"));
		
		System.out.println(array);
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}
