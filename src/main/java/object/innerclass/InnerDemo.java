package object.innerclass;
//成员内部类
public class InnerDemo {
	public static void main(String[] args) {
		Out o=new Out();
		o.method();
		
		Out.Inner i=new Out().new Inner();
		i.function();
		
		Out.Inner3 i3=new Out.Inner3();
		i3.function();
	}
	
}
class Out{
	static private int x=10;
	public void method(){
		Inner i=new Inner();
		i.function();
	}
	class Inner{
		public void function(){
			System.out.println(x);
		}
	}
	private class Inner2{
		public void function(){
			System.out.println(x);
		}
	}
	static class Inner3{
		public void function(){
			System.out.println(x);
		}
	}
}

