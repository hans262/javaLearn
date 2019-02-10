package object.interface_;
/*
 * 接口 interface 比抽象类还抽象
 * 接口类只能有抽象方法、只能有常量
 * 只能使用 public abstract 修饰方法
 * 只能使用public static final修饰常量
 * 
 * implements 与接口发生关系
 * 必须重写接口类中的抽象方法
 * 
 * 类与类的关系：继承关系，单一继承，多层继承
 * 类与接口的关系：实现关系，多实现，一个类可以实现多个接口
 * 接口与接口的关系：继承关系，多继承
 * 
 * 接口的优点：降低了程序的耦合性，可实现模块化开发，
 * 先定义接口，再来实现接口，提高开发效率
 * 接口是为了实现，是为了解决java中类的单一继承，接口是可以多继承的
 * 
 * */
public class InterfaceDemo {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		System.out.println(c.age);
		c.funcA();
		c.funcB();
		c.funcC();
	}
}

interface InterA{
	public abstract void funcA();
}
interface InterB{
	public abstract void funcB();
}
interface InterC{
	public abstract void funcC();
}
interface Animal extends InterA,InterB{
	public static final int age=10;
	public abstract void eat();
}
class Cat implements Animal,InterC{
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	@Override
	public void funcA() {
		System.out.println("这是实现InterA接口中的抽象方法");
	}
	@Override
	public void funcB() {
		System.out.println("这是实现InterB接口中的抽象方法");
	}
	@Override
	public void funcC() {
		System.out.println("这是实现InterC接口中的抽象方法");
	}
}


