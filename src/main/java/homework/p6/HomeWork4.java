package homework.p6;
/*
interface Inter {
	void show(); 
}
class Outer { 
	//补齐代码 
	public static Inter method() { 
		
	}
}
public class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
要求在控制台输出”HelloWorld”
*/
public class HomeWork4 {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
interface Inter {
	void show(); 
}
class Outer { 
	//补齐代码 
	public static Inter method() { 
		return new Inter(){
			@Override
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

