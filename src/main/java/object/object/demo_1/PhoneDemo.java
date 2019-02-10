package object.object.demo_1;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.brand="华为";
		p.color="红色";
		p.price=2500;
		System.out.println(p.brand+","+p.color+","+p.price);
		p.call("徐会长");
		p.sendMessage();
		
		Phone p2=p;
		p2.brand="小米";
		p2.color="黑色";
		p2.price=1999;
		System.out.println(p.brand+","+p.color+","+p.price);
		System.out.println(p2.brand+","+p2.color+","+p2.price);
		p.call("徐会长");
		p.sendMessage();
	}
}
