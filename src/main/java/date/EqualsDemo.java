package date;
/*
 * equals比较引用类型，是比较地址值
 * 
 * */

public class EqualsDemo {
	public static void main(String[] args) {
		Person p1=new Person("张三",18);
		Person p2=new Person("张三",18);
		System.out.println(p1.equals(p2));
//		System.out.println(p1==p2);
	}
}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object o){
		//过滤是否是同一地址值中的对象
		if(this==o) return true;
		//过滤是否是同类型对象，增加健壮性
		if(this.getClass()!=o.getClass()) return false;
		//向下转型，Object转Person
		Person other=(Person)o;
		//比较同类型对象属性是否相等
		if(!this.name.equals(other.name)) return false;
		if(this.age!=other.age) return false;
		//以上都通过
		return true;
	}
}
