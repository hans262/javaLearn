package tool.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
	public static void main(String[] args) {
		//����
		String[] a= {"����","����","��Ƭ","÷��"};
		String[] b= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				list.add(a[i]+b[j]);
			}
		}
		list.add("����");
		list.add("С��");
		//ϴ��
		Collections.shuffle(list);
		//����
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
		System.out.print("����:");
		for(int i=list.size()-3;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
	}
}
