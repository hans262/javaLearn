package homework;
/*
1.������״��:
	����:�����,���ܳ�
2.����Բ����:
	����:�뾶,Բ����
	����:�����,���ܳ�
3.���峤������:
	����:���Ϳ�
	����:�����,���ܳ�
4.���������:
	�ֱ𴴽�Բ�κͳ����ζ���,Ϊ��Ӧ�����Ը�ֵ
	�ֱ��������������ܳ��ķ���
*/
public class HomeWork1 {
	public static void main(String[] args) {
		Changf c=new Changf();
		c.w=10;
		c.h=5;
		System.out.println("����ǣ�"+c.getMian());
		System.out.println("�ܳ��ǣ�"+c.getZhou());
		
		Yuan y=new Yuan();
		y.r=10;
		System.out.println("����ǣ�"+y.getMian());
		System.out.println("�ܳ��ǣ�"+y.getZhou());
	}
}
interface PP{
	public abstract int getMian();
	public abstract int getZhou();
}
class Changf implements PP{
	int w;
	int h;
	public int getMian() {
		return w*h;
	}
	public int getZhou() {
		return 2*(w+h);
	}
}
class Yuan implements PP{
	int r;
	final double pi=Math.PI;
	public int getMian(){
		return (int)Math.round(pi*Math.pow(r,2));
	}
	public int getZhou(){
		return (int)Math.round(2*pi*r);
	}
}






