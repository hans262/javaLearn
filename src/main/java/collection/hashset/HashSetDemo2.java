package collection.hashset;

import java.util.HashSet;
/*
 * add�������Ϊʲô����ȥ��
 * p.hash == hash && (k = p.key) == key || (key != null && key.equals(k)))
 *   �鿴addԴ�룺�ȱȽ�hashCodeֵ�Ƿ���ȣ��ٱȽϵ�ֵַ�Ƿ����
 *   
 * �����add�����������ȥ���أ�
 * ��дequals��hashCode����
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
		if(this==o) return true;//��ַ��ֱͬ��true
		if(o==null) return false;//����Ϊnullֱ��false
		if(this.getClass()!=o.getClass()) return false;//�Ƚ϶��������Ƿ���ͬ
		
		Student s=(Student)o;//����ת��
		if(this.age!=s.age) return false;//�Ƚ�����
		if(this.name==null) {//�������Ϊnull
			if(s.name!=null) return false;//�������������Ϊnullֱ��false
		}else if(!this.name.equals(s.name)) return false;//���ֲ�Ϊ�գ��Ƚ�����
		return true;//���϶����㷵��true
	}
	@Override
	public int hashCode() {
		return age+name.hashCode();
	}
}