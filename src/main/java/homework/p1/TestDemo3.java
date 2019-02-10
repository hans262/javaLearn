package homework.p1;

public class TestDemo3 {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.setColor("花色");
		c.setBreed("波斯猫");
		c.eat();
		c.catchMouse();
		System.out.println(c.getColor()+","+c.getBreed());
		
		Dog d=new Dog();
		d.setColor("黑色");
		d.setBreed("藏獒");
		d.eat();
		d.lookHome();
		System.out.println(d.getColor()+","+d.getBreed());
	}
}
