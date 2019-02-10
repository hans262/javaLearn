package object.static_;
/*
 * 静态代码块：随着类的加载而加载，优先级最高，且多次创建类只执行一次静态代码块。
 * 构造代码块：随着创建对象，执行构造函数而执行，优先于构造函数执行，所有构造函数共享此代码块，多次创建对象可多次执行。
 * 方法代码块：按程序顺序执行，且代码块内外变量不可访问，主要作用（可及早的结束变量生命周期，防止内存占用）。
 * */
public class Test2 {
	static{
		System.out.println("Test2的静态代码块");
	}
	{
		System.out.println("Test2的构造代码块");
	}
	Test2(){
		System.out.println("Test2的构造方法");
	}
	public static void main(String[] args) {
		System.out.println("test2的主方法");
		Coder c=new Coder();
		Test2 t=new Test2();
		{
			System.out.println("这是方法代码块");
		}
	}
}
class Coder{
	static{
		System.out.println("Coder的静态代码块");
	}
	{
		System.out.println("Coder的构造代码块");
	}
	public Coder(){
		System.out.println("Coder的构造方法");
	}
}
