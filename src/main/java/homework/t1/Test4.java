package homework.t1;
/*
 * �ӿڣ�
 * �ȳ����໹��������ȫ�ǳ��󷽷�,ֻ���г��󷽷�
 * 
 * ��̬��
 * ������������,ֻ�ܵ��ø���ӵ�еķ������򸸽ӿ�ʵ�ֵķ���
 * ��Ҫ�������෽������Ҫ����ת��
 * 
 * 
 * */
public class Test4 {
	public static void main(String[] args) {
		QQ q=new PP();//����ת��
		q.c();
		((PP)q).a();//����ת��
		
	}
}

class PP extends QQ implements OO{
	@Override
	public void a() {
		System.out.println("a");
	}
	@Override
	public void b() {
		System.out.println("b");
	}
}
class QQ{
	public void c(){
		System.out.println("c");
	}
}
interface OO{
	public abstract void a();
	public abstract void b();
}
