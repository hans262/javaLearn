package homework.p6;
/*
1.接口IPlay中有一个方法playGame()，在测试类中如何调用该方法？
要求1.创建子类实现接口的方式实现 
要求2:用匿名内部类实现

2.一个抽象类Fun中有一个抽象方法 fun() , 在测试类中如何调用该方法?
要求1.创建子类继承抽象类的方式实现
要求2:用匿名内部类实现
*/
public class HomeWork2 {
	public static void main(String[] args) {
		//内部类实现接口
		new IPlay(){
			@Override
			public void playGame() {
				System.out.println("玩游戏");
			}
        }.playGame();
        
        //内部类继承父类
        new Fun(){
			@Override
			public void fun() {
				System.out.println("fun");
			}
        }.fun();
	}
}
class kid extends Fun{
	@Override
	public void fun() {
		System.out.println("fun");
	}
}
abstract class Fun{
	public abstract void fun();
}
interface IPlay{
	public abstract void playGame();
}


