package object.innerclass;
//�ֲ��ڲ���
public class InnerDemo2 {
	public static void main(String[] args) {
		
	}
}
class Wber{
	public void function(){
		class Jber{
			public void method(){
				System.out.println("method");
			}
		}
		//ֻ���ڱ�������ʹ��
		Jber j=new Jber();
		j.method();
	}
}

