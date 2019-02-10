package homework.t1;

import homework.p1.Cat;
/*
 * 修饰符
 * public 全局
 * static 静态，随class的加载而加载
 * private 私有的，本类中访问
 * final 修饰常量，修饰类不能继承
 * 
 * 
 * 
 * 
 * */
public class Test5 {
	public static void main(String[] args) {
		Cat c=new Cat();
		
		RR r=new RR();
		r.a();
		
		
	}
}
class RR{
	class rr{
		public void b(){
			System.out.println("b");
		}
	}
	public void a(){
		new rr().b();
	}
}



