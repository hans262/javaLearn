package collection.list;

import java.util.ArrayList;
import java.util.List;

/*
 * ���飺��ѯ�죬��ɾ��
 * 
 * ������һ��Ԫ�ش�����һ��Ԫ�صĵ�ֵַ����������
 * ��ɣ���ֵַ��ֵ����һ����ֵַ��
 * ��ѯ������ɾ��
 * 
 * ջ��ѹջ
 * �Ƚ������
 * ���ӣ����С���պ�ͬ��
 * 
 * ���У�
 * �Ƚ��ȳ�
 * ���ӣ��Ŷ���Ʊ���������ߣ�
 * 
 * 
 * List:
 * 
 * 
 * */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//���ӣ���ָ����������Ԫ�أ�����ԭλ��Ԫ������ƶ�һλ
		list.add(0,"hello");
		list.add(1,"java");
		list.add(1,"world");
		//ɾ��,ɾ������λ��Ԫ�أ������ر�ɾ��Ԫ��
		System.out.println(list.remove(1));
		//�޸�,�޸�����λ��Ԫ�أ�������ԭ��λ��Ԫ��
		System.out.println(list.set(0, "android"));
		//����Ԫ��,�õ�������λ��Ԫ��
		System.out.println(list.get(1));
		
		System.out.println(list);
	}
}
