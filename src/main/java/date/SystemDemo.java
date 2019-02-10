package date;

class Demo{
	@Override
	protected void finalize() throws Throwable {
		//�����󱻻��յ�ʱ��ϵͳ����õķ���
		super.finalize();
		System.out.println("�ұ�������");
	}
}
public class SystemDemo {
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
		method4();
		
	}

	private static void method4() {
		new Demo();
		System.gc();//�����������󣬲���ÿ�ζ�����ĳ������
	}

	private static void method3() {
		//��ֹjava�����
		for(int i=0;i<1000;i++){
			System.out.println(i);
			if(i==100){
				System.exit(0);
			}
		}
	}

	private static void method2() {
		//��ǰ��Ժ�����
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}

	private static void method1() {
		//��������
		int[] arr1={1,2,3,4,5};
		int[] arr2=new int[5];
		System.arraycopy(arr1, 0, arr2, 0, 5);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+",");
		}
	}
}
