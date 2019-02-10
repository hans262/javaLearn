package object.abstract_;
/*
 * 抽象方法必须在抽象类中，方法和类都必须修饰
 * 继承抽象类，如果父类有抽象方法，必须重写父类类的抽象方法
 * 抽象类不能创建对象
 * 抽象类中可拥有非抽象方法
 * 抽象类可以有构造方法
 * 
 * 抽象类不能和final、private关键词共存
 * 
 * */
public class AbstractDemo {
	public static void main(String[] args) {
		Cat c=new Cat();
		
	}
}
abstract class Animal{
	public Animal(){
		System.out.println("抽象构造");
	}
	public abstract void eat();
}

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("狗吃屎");
	}
}
