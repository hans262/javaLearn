package besic.break_continue;

public class BreakAndContinueDemo {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i%3==0){
				break;//����ѭ��
//				continue;//ֻ��������ѭ������һ�μ���ִ��
			}
			System.out.println(i);
		}
	}
}
