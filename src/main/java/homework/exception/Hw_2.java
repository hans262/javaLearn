package homework.exception;

import java.util.HashSet;
import java.util.Set;


public class Hw_2 {
	public static void main(String[] args) {
		//���õݹ�д����1-n(n<=1000)�����ֵĺͰ���
		
		
//		System.out.println(getSun(1000));
		
//		����������:
//			��һ��: 1
//			�ڶ���: 2
//			������: 2
//			������: 4
//			������: 8
//			������: 32
//			������: 256
//			//....
//			���õݹ�����10���Ƕ���?
//		o=f(n-1)*f(n-2)
		long t=System.currentTimeMillis();
		System.out.println(getO(10));
		System.out.println(System.currentTimeMillis()-t);
	}
	public static long getO(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return getO(n-1)*getO(n-2);
		}
	}
	public static int getSun(int n){
		if(n==1) return 1;
		return getSun(n-1)+n;
	}
}
