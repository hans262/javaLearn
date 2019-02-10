package date;

class Demo{
	@Override
	protected void finalize() throws Throwable {
		//当对象被回收的时候，系统会调用的方法
		super.finalize();
		System.out.println("我被回收了");
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
		System.gc();//回收垃圾对象，不是每次都回收某个对象
	}

	private static void method3() {
		//终止java虚拟机
		for(int i=0;i<1000;i++){
			System.out.println(i);
			if(i==100){
				System.exit(0);
			}
		}
	}

	private static void method2() {
		//当前相对毫秒数
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}

	private static void method1() {
		//复制数组
		int[] arr1={1,2,3,4,5};
		int[] arr2=new int[5];
		System.arraycopy(arr1, 0, arr2, 0, 5);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+",");
		}
	}
}
