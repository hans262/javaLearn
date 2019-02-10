package homework.p1;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p=new Phone("小米",288);
		p.setBrand("华为");
		p.setPrice(2999);
		System.out.println(p.getBrand()+","+p.getPrice());
		p.call();
	}
}
