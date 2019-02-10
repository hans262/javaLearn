package collection.list;

import java.util.LinkedList;

/*
 * List��������
 * 		ArrayList
 * 			�ײ����飬��ѯ�죬��ɾ��
 * 		LinkedList
 * 			�ײ�������ѯ������ɾ��
 * 
 * 
 * */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("hello");
		link.add("java");
		
		//��ӵ���һ�������һ��Ԫ��
		link.addFirst("android");
		link.addLast("world");
		//�õ���һ�������һ��Ԫ��
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		//ɾ����һ�������һ��Ԫ��
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		System.out.println(link);
		
	}
}
