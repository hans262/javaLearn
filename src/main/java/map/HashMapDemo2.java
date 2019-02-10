package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap<Student,String>();
		hm.put(new Student("张三",22), "001");
		hm.put(new Student("李四",28), "002");
		hm.put(new Student("王五",25), "003");
		//第一种遍历
		Set<Student> keys=hm.keySet();
		for(Student key:keys) {
			String value=hm.get(key);
			System.out.println(key.name+","+key.age+","+value);
		}
		//第二种遍历
		System.out.println("------------");
		Set<Map.Entry<Student, String>> entrys=hm.entrySet();
		for(Map.Entry<Student, String> entry:entrys) {
			Student key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key.name+","+key.age+","+value);
		}
		
	}
}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}