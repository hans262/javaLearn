package object.static_;
/*
 * ��̬����飺������ļ��ض����أ����ȼ���ߣ��Ҷ�δ�����ִֻ��һ�ξ�̬����顣
 * �������飺���Ŵ�������ִ�й��캯����ִ�У������ڹ��캯��ִ�У����й��캯������˴���飬��δ�������ɶ��ִ�С�
 * ��������飺������˳��ִ�У��Ҵ��������������ɷ��ʣ���Ҫ���ã��ɼ���Ľ��������������ڣ���ֹ�ڴ�ռ�ã���
 * */
public class Test2 {
	static{
		System.out.println("Test2�ľ�̬�����");
	}
	{
		System.out.println("Test2�Ĺ�������");
	}
	Test2(){
		System.out.println("Test2�Ĺ��췽��");
	}
	public static void main(String[] args) {
		System.out.println("test2��������");
		Coder c=new Coder();
		Test2 t=new Test2();
		{
			System.out.println("���Ƿ��������");
		}
	}
}
class Coder{
	static{
		System.out.println("Coder�ľ�̬�����");
	}
	{
		System.out.println("Coder�Ĺ�������");
	}
	public Coder(){
		System.out.println("Coder�Ĺ��췽��");
	}
}
