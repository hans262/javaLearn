package homework.p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



/*
1.����10��1��100֮����������(�����ظ�)������һ��List����
2.Ȼ�����õ���������ǿforѭ���ֱ��������Ԫ�ز����
3.�磺15 18 20 40 46 60 65 70 75 91
*/

public class HomeWork1 {
	public static void main(String[] args) { 
		List<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		
		//ȡ�������
		while(list.size()<10){
			int x=r.nextInt(100);//�õ�0-10���������������10
			if(list.contains(x)){//������ϴ���x������������ѭ��
				continue;
			}
			list.add(x);
		}
		//����������
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.println();
		//��ǿforѭ������
		for(int val:list){
			System.out.print(val+",");
		}
		System.out.println();
	}
}

