package homework.p6;
/*
进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘，（每个功能就是一个对应的成员方法）
1.定义USB接口:
	开启功能
	关闭功能

2.定义笔记本类:
	开机功能
	关机功能
	定义使用USB设备的功能
	要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能

3.定义鼠标类:
	要符合USB接口

4.定义键盘类:
	要符合USB接口

5.定义测试类:
	创建电脑对象,依次调用开机方法,使用USB设备, 关机方法

	打印效果如下:
		开机
		连接鼠标的USB
		断开鼠标的USB
		连接键盘的USB
		断开键盘的USB
		关机
*/
public class HomeWork1 {
	public static void main(String[] args) {
//		创建电脑对象,依次调用开机方法,使用USB设备, 关机方法
		Computer c=new Computer();
		c.openJ();
		c.closeJ();
		c.useUSB(new keyboard());
	}
}
class Computer{
	public void openJ(){
		System.out.println("开机");
	}
	public void closeJ(){
		System.out.println("关机");
	}
	public void useUSB(USB u){
		u.open();
		u.close();
	}
}
class Mouse implements USB{
	@Override
	public void close() {
		System.out.println("关闭usb");
	}
	@Override
	public void open() {
		System.out.println("开启usb");
	}
}
class keyboard implements USB{
	@Override
	public void close() {
		System.out.println("关闭usb");
	}
	@Override
	public void open() {
		System.out.println("开启usb");
	}
}
interface USB{
	public abstract void open();
	public abstract void close();
}

