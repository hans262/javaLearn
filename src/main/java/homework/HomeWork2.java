package homework;
/*
	1.定义手机类
	行为:打电话,发短信
	2.定义接口IPlay
	行为:玩游戏
	3.定义旧手机类继承手机类
	行为:继承父类的行为
	4.定义新手机继承手机类实现IPlay接口
	行为:继承父类的行为,重写玩游戏方法
	5.定义测试类
	在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
	在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
*/
public class HomeWork2 {
	public static void main(String[] args) {
		Test t=new Test();
		t.usePhone(new oldPhone());
	}
}
class Test{
	public void usePhone(Phone p){
		if(p instanceof newPhone){
			p.call();
			p.sendMsg();
			((newPhone) p).palyGame();
		}else if(p instanceof oldPhone){
			p.call();
			p.sendMsg();
		}
	}
}
class oldPhone extends Phone{
	public void call(){
		System.out.println("旧手机打电话。。");
	}
	public void sendMsg(){
		System.out.println("旧手机发短信。。");
	}
}
class newPhone extends Phone implements IPlay{
	public void call(){
		System.out.println("新手机打电话。。");
	}
	public void sendMsg(){
		System.out.println("新手机发短信。。");
	}
	public void palyGame() {
		System.out.println("新手机玩游戏。。");
	}
}
class Phone{
	public void call(){
		System.out.println("打电话。。");
	}
	public void sendMsg(){
		System.out.println("发短信。。");
	}
}
interface IPlay{
	public abstract void palyGame();
}



