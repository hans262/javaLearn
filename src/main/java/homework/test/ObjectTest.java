package homework.test;

public class ObjectTest {
	static{
		System.out.println("静态代码块");
	}
	{
		System.out.println("构造代码块");
	}
	ObjectTest(){
		System.out.println("构造函数");
	}
	public static void main(String[] args) {
		Dad d=new Dad();
		Dad d2=new Dad(5);
		System.out.println("主函数");
		{
			System.out.println("主函数代码块");
		}
	}
	{
		System.out.println("构造代码块2");
	}
}
class Dad{
	{
		System.out.println("Dad构造代码块");
	}
	static{
		System.out.println("Dad静态代码块");
	}
	public Dad(){
		System.out.println("Dad构造函数");
	}
	public Dad(int a){
		System.out.println("Dad有参构造函数");
	}
}
