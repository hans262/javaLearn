package homework.p1;
/*����:
	Ʒ��brand
	�۸�price
��Ϊ:
	��绰call()
	������sendMessage()
	����ϷplayGame()
	
Ҫ��:
	1.��������Ҫ������,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
	2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
	3.����������Ա����,��ӡ��ʽ����:
		����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ���绰....
		����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ�������....
		����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ�����Ϸ....*/
public class Phone {
	private String brand;
	private int price;
	public Phone() {}
	public Phone(String brand,int price) {
		System.out.println(brand+","+price);
	}
	public void call() {
		System.out.println("����ʹ�ü۸�Ϊ"+this.price+"Ԫ��"+this.brand+"Ʒ�Ƶ��ֻ���绰....");
	}
	public void sendMessage() {
		System.out.println("����ʹ�ü۸�Ϊ"+this.price+"Ԫ��"+this.brand+"Ʒ�Ƶ��ֻ��򷢶���....");
	}
	public void playGame() {
		System.out.println("����ʹ�ü۸�Ϊ"+this.price+"Ԫ��"+this.brand+"Ʒ�Ƶ��ֻ�����Ϸ....");
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
}
