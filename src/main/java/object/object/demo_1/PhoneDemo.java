package object.object.demo_1;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.brand="��Ϊ";
		p.color="��ɫ";
		p.price=2500;
		System.out.println(p.brand+","+p.color+","+p.price);
		p.call("��᳤");
		p.sendMessage();
		
		Phone p2=p;
		p2.brand="С��";
		p2.color="��ɫ";
		p2.price=1999;
		System.out.println(p.brand+","+p.color+","+p.price);
		System.out.println(p2.brand+","+p2.color+","+p2.price);
		p.call("��᳤");
		p.sendMessage();
	}
}
