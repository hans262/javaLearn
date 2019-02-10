package tool.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
	public static void main(String[] args) {
		//买牌
		String[] a= {"黑桃","红桃","方片","梅花"};
		String[] b= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				list.add(a[i]+b[j]);
			}
		}
		list.add("大王");
		list.add("小王");
		//洗牌
		Collections.shuffle(list);
		//发牌
		List<String> A=new ArrayList<String>();
		List<String> B=new ArrayList<String>();
		List<String> C=new ArrayList<String>();
		
		for(int i=0;i<list.size()-3;i++) {
			if(i%3==0) A.add(list.get(i));
			else if(i%3==1) B.add(list.get(i));
			else if(i%3==2) C.add(list.get(i));
		}
		
		System.out.println("A:"+A);
		System.out.println("B:"+B);
		System.out.println("C:"+C);
		System.out.print("底牌:");
		for(int i=list.size()-3;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
	}
}
