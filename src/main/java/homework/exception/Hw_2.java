package homework.exception;

import java.util.HashSet;
import java.util.Set;


public class Hw_2 {
	public static void main(String[] args) {
		//利用递归写出求1-n(n<=1000)的数字的和案例
		
		
//		System.out.println(getSun(1000));
		
//		有如下数列:
//			第一项: 1
//			第二项: 2
//			第三项: 2
//			第四项: 4
//			第五项: 8
//			第六项: 32
//			第七项: 256
//			//....
//			利用递归计算第10项是多少?
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
