package homework;
/*
1.定义动物类
行为:eat方法(无具体行为,不同动物吃的不一样)
2.定义狗类继承动物类
行为:eat方法(啃骨头),看家方法
3.定义猫类继承动物类
行为:eat方法(吃鱼),抓老鼠方法
4.测试类:
定义一个方法,要求该方法既能接收狗对象也能接收猫对象
在该方法的内部调用eat()方法,并且调用狗和猫的特有方法
*/
public class HomeWork3 {
	public static void main(String[] args) {
		test(new Cat());
	}
	public static void test(Animal a){
		if(a instanceof Dog){
			a.eat();
			((Dog) a).seeHome();
		}else if(a instanceof Cat){
			a.eat();
			((Cat) a).playMouse();
		}
	}
}
abstract class Animal{
	public abstract void eat();
}
class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void playMouse(){
		System.out.println("抓老鼠");
	}
}
class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("狗啃骨头");
	}
	public void seeHome(){
		System.out.println("狗看家");
	}
}


