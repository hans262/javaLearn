package date;
/*
 * equals�Ƚ��������ͣ��ǱȽϵ�ֵַ
 * 
 * */

public class EqualsDemo {
	public static void main(String[] args) {
		Person p1=new Person("����",18);
		Person p2=new Person("����",18);
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
		//�����Ƿ���ͬһ��ֵַ�еĶ���
		if(this==o) return true;
		//�����Ƿ���ͬ���Ͷ������ӽ�׳��
		if(this.getClass()!=o.getClass()) return false;
		//����ת�ͣ�ObjectתPerson
		Person other=(Person)o;
		//�Ƚ�ͬ���Ͷ��������Ƿ����
		if(!this.name.equals(other.name)) return false;
		if(this.age!=other.age) return false;
		//���϶�ͨ��
		return true;
	}
}
