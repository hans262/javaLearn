package object.innerclass;

public class InnerDemo4 {
	public static void main(String[] args) {
		method(
			new Animal(){
				@Override
				public void eat() {
					System.out.println("√®≥‘”„");
				}
			}
		);
	}
	public static void method(Animal a){
		a.eat();
	}
}

interface Animal{
	public abstract void eat();
}
