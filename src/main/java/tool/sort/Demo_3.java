package tool.sort;
/*
 * 斐波那契列数：
 * 		有的一对兔子，出生后三个月起，每个月生一对兔子，
 * 		小兔子出生后满三个月也出生一对兔子，如果兔子都不死，求20个月有多少对兔子
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 
 * 递归算法：number=f(n-1)+f(n-2)
 * */
public class Demo_3 {
	public static void main(String[] args) {
		int num=getNum(20);
		System.out.println(num);
	}
	public static int getNum(int m) {
		if(m==1) {
			return 1;
		}else if(m==2) {
			return 1;
		}else {
			return getNum(m-1)+getNum(m-2);
		}
	}
}
