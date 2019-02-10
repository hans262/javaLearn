package homework;
/*
1.定义形状类:
	功能:求面积,求周长
2.定义圆形类:
	属性:半径,圆周率
	功能:求面积,求周长
3.定义长方形类:
	属性:长和宽
	功能:求面积,求周长
4.定义测试类:
	分别创建圆形和长方形对象,为相应的属性赋值
	分别调用求面积和求周长的方法
*/
public class HomeWork1 {
	public static void main(String[] args) {
		Changf c=new Changf();
		c.w=10;
		c.h=5;
		System.out.println("面积是："+c.getMian());
		System.out.println("周长是："+c.getZhou());
		
		Yuan y=new Yuan();
		y.r=10;
		System.out.println("面积是："+y.getMian());
		System.out.println("周长是："+y.getZhou());
	}
}
interface PP{
	public abstract int getMian();
	public abstract int getZhou();
}
class Changf implements PP{
	int w;
	int h;
	public int getMian() {
		return w*h;
	}
	public int getZhou() {
		return 2*(w+h);
	}
}
class Yuan implements PP{
	int r;
	final double pi=Math.PI;
	public int getMian(){
		return (int)Math.round(pi*Math.pow(r,2));
	}
	public int getZhou(){
		return (int)Math.round(2*pi*r);
	}
}






