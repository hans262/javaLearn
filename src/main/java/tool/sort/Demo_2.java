package tool.sort;
/*
 * 递归
 * 
 * 阶乘算法：
 * 		n!=n*(n-1)!
 * 
 * 递归的注意：
 * 		不可多用，内存泄露
 * 		必须要有出口，内存泄露
 * 
 * */
public class Demo_2 {
	public static void main(String[] args) {
		int result=JC(5);
		System.out.println(result);
	}
	public static int JC(int n) {
		if(n==1) return 1;
		return n*JC(n-1);
	}
}
