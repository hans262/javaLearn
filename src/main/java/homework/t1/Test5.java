package homework.t1;

import homework.p1.Cat;
/*
 * ���η�
 * public ȫ��
 * static ��̬����class�ļ��ض�����
 * private ˽�еģ������з���
 * final ���γ����������಻�ܼ̳�
 * 
 * 
 * 
 * 
 * */
public class Test5 {
	public static void main(String[] args) {
		Cat c=new Cat();
		
		RR r=new RR();
		r.a();
		
		
	}
}
class RR{
	class rr{
		public void b(){
			System.out.println("b");
		}
	}
	public void a(){
		new rr().b();
	}
}



