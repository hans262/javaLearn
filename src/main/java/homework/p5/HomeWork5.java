package homework.p5;
/*
1.定义动物类：
行为：
	吼叫；没有具体的吼叫行为
	吃饭:没有具体的吃饭行为
2.定义缉毒接口
行为: 
	缉毒
3.定义缉毒狗:犬的一种
行为：
	吼叫:汪汪叫
	吃饭:狗啃骨头
	缉毒:用鼻子侦测毒
4.定义测试类:
使用多态的形式创建缉毒狗对象,调用缉毒方法和吼叫方法
*/
public class HomeWork5 {
	public static void main(String[] args) {
		Animal a=new JdDog();
		((JdDog)a).jidu();//强转调用
		a.speak();
		a.eat();
	}
}
abstract class Animal{
	public abstract void speak();
	public abstract void eat();
}
interface JD{
	public abstract void jidu();
}
class JdDog extends Animal implements JD{
	@Override
	public void eat() {
		System.out.println("狗啃骨头");
	}
	@Override
	public void speak() {
		System.out.println("汪汪叫");
	}
	public void jidu() {
		System.out.println("用鼻子侦测毒");
	}
}

