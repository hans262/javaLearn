package homework.test;

public class ObjectExtends {
	public static void main(String[] args) {
		Lol l=new Lol();
		l.start();
	}
}
class Game{
	String name;
	String verson;
	Game(){
		System.out.println("game");
	}
	public void start() {
		System.out.println("start");
	}
	public void end() {
		System.out.println("end");
	}
}
class Lol extends Game{
	public Lol() {
		super();
		System.out.println("zhe shi lol");
	}
	public void start(){
		System.out.println("lol start");
	}
}