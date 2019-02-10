package homework.p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



/*
1.生成10个1至100之间的随机整数(不能重复)，存入一个List集合
2.然后利用迭代器和增强for循环分别遍历集合元素并输出
3.如：15 18 20 40 46 60 65 70 75 91
*/

public class HomeWork1 {
	public static void main(String[] args) { 
		List<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		
		//取得随机数
		while(list.size()<10){
			int x=r.nextInt(100);//得到0-10的随机数，不包括10
			if(list.contains(x)){//如果集合存在x，就跳出本次循环
				continue;
			}
			list.add(x);
		}
		//迭代器遍历
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.println();
		//增强for循环遍历
		for(int val:list){
			System.out.print(val+",");
		}
		System.out.println();
	}
}

