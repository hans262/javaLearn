package collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Student> array=new ArrayList<Student>();
		addStudent(array);
		addStudent(array);
		addStudent(array);
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
	}
	public static void addStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		String name=sc.nextLine();
		System.out.println("���������䣺");
		String age=sc.nextLine();
		array.add(new Student(name,age));
	}
}
