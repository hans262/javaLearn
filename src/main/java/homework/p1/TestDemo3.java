package homework.p1;

public class TestDemo3 {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.setColor("��ɫ");
		c.setBreed("��˹è");
		c.eat();
		c.catchMouse();
		System.out.println(c.getColor()+","+c.getBreed());
		
		Dog d=new Dog();
		d.setColor("��ɫ");
		d.setBreed("����");
		d.eat();
		d.lookHome();
		System.out.println(d.getColor()+","+d.getBreed());
	}
}
