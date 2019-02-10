package object.innerclass;
//匿名内部类
public class InnerDemo3 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.method();
	}
}
interface Func{
	public abstract void function();
}
class Outer{
	public void method(){
		Func f=new Func(){
			@Override
			public void function() {
				System.out.println("function");
			}
		};
		f.function();
	}
}