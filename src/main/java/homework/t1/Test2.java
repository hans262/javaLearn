package homework.t1;
/*
 * 静态代码块：随着class文件的加载而加载，多次调用对象且只执行一次，
 * 主函数执行，自动执行本类静态代码块，多个静态代码块按顺序执行
 * 
 * 静态变量：可以使用对象名.变量调用
 * 
 * 构造代码块：优先于构造执行，多次调用多次执行，执行顺序不变，多个构造函数共享一个构造代码块
 * 对象不调用不执行构造代码块，多个构造代码块按顺序执行。
 * 
 * */
public class Test2 {
	static{
		System.out.println("Test2静态代码块");
	}
	{
		System.out.println("Test2构造代码块");
	}
	public static void main(String[] args) {
		A a=new A();
		System.out.println(A.a);
		A a2=new A(25);
		
	}
}

class A{
	static int a=10;
	static{
		System.out.println("A静态代码块1");
	}
	{
		System.out.println("A构造代码块1");
	}
	{
		System.out.println("A构造代码块2");
	}
	public A(){
		System.out.println("A构造");
	}
	public A(int age){
		System.out.println("A有参构造");
	}
	public static void methodA(){
		System.out.println("A");
	}
}
