package collection.hashset;

import java.util.HashSet;
/*
 * add存入对象为什么不能去重
 * p.hash == hash && (k = p.key) == key || (key != null && key.equals(k)))
 *   查看add源码：先比较hashCode值是否相等，再比较地址值是否相等
 *   
 * 如何让add方法存入对象去重呢？
 * 重写equals和hashCode方法
 * 
 * */
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> set=new HashSet<Student>();
		set.add(new Student("Bill",25));
		set.add(new Student("Tom",24));
		set.add(new Student("Kemi",26));
		set.add(new Student("Kemi",26));
		for(Student s:set) {
			System.out.println(s.toString());
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("----");
		if(this==o) return true;//地址相同直接true
		if(o==null) return false;//对象为null直接false
		if(this.getClass()!=o.getClass()) return false;//比较对象类型是否相同
		
		Student s=(Student)o;//向下转型
		if(this.age!=s.age) return false;//比较年龄
		if(this.name==null) {//名字如果为null
			if(s.name!=null) return false;//参数名字如果不为null直接false
		}else if(!this.name.equals(s.name)) return false;//名字不为空，比较名字
		return true;//以上都满足返回true
	}
	@Override
	public int hashCode() {
		return age+name.hashCode();
	}
}