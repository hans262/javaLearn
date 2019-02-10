package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//泛型的好处 <E>,规定存入集合的类型，及早的发现错误

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection<Student> c=new ArrayList<Student>();
		c.add(new Student("Bill",18));
		c.add(new Student("Tom",20));
		c.add(new Student("Bob",19));
		Iterator<Student> it=c.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}
