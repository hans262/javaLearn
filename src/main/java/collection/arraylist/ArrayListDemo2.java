package collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("q");
		array.add("w");
		array.add("e");
		array.add("r");
		array.add("t");
		
		System.out.println(array.get(1));//����������������,��������
		System.out.println(array.size());//���س���
//		System.out.println(array.remove("q"));//��������ɾ��,����boolean
//		System.out.println(array.remove(0));//��������ɾ��,���ر�ɾ��Ԫ��
		System.out.println(array.set(0,"b"));//���������޸�,���ر��޸�Ԫ��
		
		System.out.println(array);
	}
}
