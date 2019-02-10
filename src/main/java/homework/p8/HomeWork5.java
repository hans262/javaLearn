package homework.p8;

import java.util.ArrayList;
import java.util.List;

/*
1.定义Person类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
2.定义Student类继承Person，属性与Person类相同
3.查看API中ArrayList集合中的以下方法：
	(1)boolean add(E e) 方法
	(2)<T> T[] toArray(T[] a)方法
	(3)boolean addAll(Collection<? extends E> c)方法
4.通过查看API对以上方法的学习，完成以下功能
	(1)ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Studentp[]，并遍历打印数组中的元素
	(2)定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象，
	定义一个存储Student对象的ArrayList集合对象list2，并存入2个Student对象，
	调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容
*/
public class HomeWork5 {
	public static void main(String[] args) {
//		method1();
		
		List<Person> list1=new ArrayList<Person>();
		list1.add(new Person("Jell",26,88));
		list1.add(new Person("Tom",25,87));
		
		List<Student> list2=new ArrayList<Student>();
		list2.add(new Student("Kemi",26,88));
		list2.add(new Student("Jonger",26,88));
//		(3)boolean addAll(Collection<? extends E> c)方法
		//合并两个集合
		list1.addAll(list2);
		for(Object o:list1){
			Person p=(Person)o;
			System.out.print(p.getName()+",");
		}
	}

	private static void method1() {
		List<Student> list=new ArrayList<Student>();
//		(1)boolean add(E e) 方法
		list.add(new Student("Bill",25,98));
		list.add(new Student("Tom",22,87));
		list.add(new Student("Kliy",23,95));
		list.add(new Student("Honil",27,79));
		list.add(new Student("Fenil",22,90));
//		(2)<T> T[] toArray(T[] a)方法
		//参数必须动态创建一个数组，给定长度
		Student[] s=list.toArray(new Student[list.size()]);
		System.out.println(s[1].getName());
	}
}
class Student extends Person{
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super(name, age, score);
	}
}
class Person{
	private String name;
	private int age;
	private int score;
	public Person() {
		super();
	}
	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}







