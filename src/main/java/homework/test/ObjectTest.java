package homework.test;

public class ObjectTest {
	static{
		System.out.println("��̬�����");
	}
	{
		System.out.println("��������");
	}
	ObjectTest(){
		System.out.println("���캯��");
	}
	public static void main(String[] args) {
		Dad d=new Dad();
		Dad d2=new Dad(5);
		System.out.println("������");
		{
			System.out.println("�����������");
		}
	}
	{
		System.out.println("��������2");
	}
}
class Dad{
	{
		System.out.println("Dad��������");
	}
	static{
		System.out.println("Dad��̬�����");
	}
	public Dad(){
		System.out.println("Dad���캯��");
	}
	public Dad(int a){
		System.out.println("Dad�вι��캯��");
	}
}
