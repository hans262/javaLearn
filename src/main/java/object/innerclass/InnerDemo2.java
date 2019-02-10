package object.innerclass;
//局部内部类
public class InnerDemo2 {
	public static void main(String[] args) {
		
	}
}
class Wber{
	public void function(){
		class Jber{
			public void method(){
				System.out.println("method");
			}
		}
		//只能在本方法中使用
		Jber j=new Jber();
		j.method();
	}
}

