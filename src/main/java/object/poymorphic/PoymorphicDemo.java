package object.poymorphic;
/*
 * 多态：
 * 子父类继承关系
 * 方法的重写
 * 父类引用指向子类的对象
 * 
 * 多态成员特点：
 * 成员变量 编译时看左边，运行时看左边
 * 成员方法 编译时看左边，运行时看右边
 * 静态方法  编译时看左边，运行时看左边
 * 
 * 向上转型：
 * 只能调用父类中有的成员方法，如果方法被重写，就调用子类重写后的方法
 * 变量因为不能继承，所以变量指向父类有的变量
 * 
 * 向下转型
 * 强转
 * 这样才能调用子类的方法
 * 
 * 
 * */
public class PoymorphicDemo {
	public static void main(String[] args) {
		Animal a=new Cat();
		a.eat();
		System.out.println(a.a);
		a.func();//使用变量去调用静态方法，相当于用变量类型类名去调用方法
		
		Cat c=(Cat)a;//向下强制转型
		c.kid();
		System.out.println(c.a);
	}
}
class Animal{
	int a=10;
	public void op(){
		System.out.println("op");
	}
	public void eat(){
		System.out.println("吃。。。");
	}
	public static void func(){
		System.out.println("这是父类静态方法");
	}
}
class Cat extends Animal{
	int a=20;
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public static void func(){
		System.out.println("这是子类静态方法");
	}
	public void kid(){
		System.out.println("kid");
	}
}
