package homework.p4;
/*
1.���嶯����
���ԣ����䣬��ɫ
��Ϊ:eat(String something)
����(�޾�����Ϊ,��ͬ����Եķ�ʽ�Ͷ�����һ��,something��ʾ�ԵĶ���)
���ɿղ��вι��죬set��get����
2.���幷��̳ж�����
��Ϊ:eat(String something)����,����lookHome����(�޲���)
3.����è��̳ж�����
��Ϊ:eat(String something)����,������catchMouse����(�޲���)
4.����Person��
���ԣ�����������
��Ϊ��keepPet(Dog dog,String something)����
���ܣ�ι�����ﹷ��something��ʾι���Ķ���
��Ϊ��keepPet(Cat cat,String something)����
���ܣ�ι������è��something��ʾι���Ķ���
���ɿղ��вι��죬set��get����  
5.���������(������´�ӡЧ��):
keepPet(Dog dog,String somethind)������ӡ�������£�
����Ϊ30�����������һֻ����ɫ��2��ĳ���
2��ĺ���ɫ�Ĺ���ֻǰ�������ı�ס��ͷ�ͳ�
keepPet(Cat cat,String somethind)������ӡ�������£�
����Ϊ25�����������һֻ����ɫ��3��ĳ���
3��Ļ���ɫ��è�����۾�����ͷ����
6.˼����		
1.Dog��Cat����Animal�����࣬���ϰ�������Բ�ͬ�Ķ��
�����˲�ͬ��keepPet���������ڷ������ܷ�򻯣������򻯺�ĺô���
2.Dog��Cat��Ȼ����Animal�����࣬
���Ƕ��������з������ܷ���취��keepPet�е������з�����
*/
public class HomeWork4 {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("����");
		p.setAge(30);
		Dog d=new Dog();
		d.setAge(2);
		d.setColor("��ɫ");
		p.keepPet(d, "��ͷ");
		
		Person p2=new Person();
		p2.setName("����");
		p2.setAge(25);
		Cat c=new Cat();
		c.setAge(3);
		c.setColor("��ɫ");
		p2.keepPet(c, "��");
	}
}
class Person{
	private String name;
	private int age;
	public void keepPet(Animal a,String food){
		if(a instanceof Dog){
			System.out.println("����Ϊ"+this.age+"���"+this.name+"����һֻ"+a.getColor()+"��"+a.getAge()+"��ĳ���");
			System.out.println(a.getAge()+"���"+a.getColor()+"�Ĺ���ֻǰ�������ı�ס"+food+"�ͳ�");
			((Dog) a).lookHome();
		}else if(a instanceof Cat){
			System.out.println("����Ϊ"+this.age+"���"+this.name+"����һֻ"+a.getColor()+"��"+a.getAge()+"��ĳ���");
			System.out.println(a.getAge()+"���"+a.getColor()+"��è�����۾�����ͷ��"+food);
			((Cat) a).catchMouse();
		}
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
}

class Cat extends Animal{
	@Override
	public void eat(String food) {
		System.out.println("è���ڳ�"+food);
	}
	public void catchMouse(){
		System.out.println("è����ץ����");
	}
}
class Dog extends Animal{
	@Override
	public void eat(String food) {
		System.out.println("�����ڳ�"+food);
	}
	public void lookHome(){
		System.out.println("�����ڿ���");
	}
}
abstract class Animal{
	private int age;
	private String color;
	public abstract void eat(String food);
	public Animal() {
		super();
	}
	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}