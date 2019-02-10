package homework.p8;

import java.util.ArrayList;
import java.util.List;

/*
1.����Person�����������String name�����䣺int age���ɼ���int score�����ɿղΡ��вι��졢set��get������toString����
2.����Student��̳�Person��������Person����ͬ
3.�鿴API��ArrayList�����е����·�����
	(1)boolean add(E e) ����
	(2)<T> T[] toArray(T[] a)����
	(3)boolean addAll(Collection<? extends E> c)����
4.ͨ���鿴API�����Ϸ�����ѧϰ��������¹���
	(1)ArrayList�����д���5��Student���󣬽�ArrayList����ת�ɶ�Ӧ������Studentp[]����������ӡ�����е�Ԫ��
	(2)����һ���洢Person�����ArrayList���϶���list1��������2��Person����
	����һ���洢Student�����ArrayList���϶���list2��������2��Student����
	����addAll������list2��ȫ��������ӵ�list1�У�������ӡlist1�е�����
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
//		(3)boolean addAll(Collection<? extends E> c)����
		//�ϲ���������
		list1.addAll(list2);
		for(Object o:list1){
			Person p=(Person)o;
			System.out.print(p.getName()+",");
		}
	}

	private static void method1() {
		List<Student> list=new ArrayList<Student>();
//		(1)boolean add(E e) ����
		list.add(new Student("Bill",25,98));
		list.add(new Student("Tom",22,87));
		list.add(new Student("Kliy",23,95));
		list.add(new Student("Honil",27,79));
		list.add(new Student("Fenil",22,90));
//		(2)<T> T[] toArray(T[] a)����
		//�������붯̬����һ�����飬��������
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







