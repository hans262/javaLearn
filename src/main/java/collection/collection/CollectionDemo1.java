package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * Collection��һ���ӿ�
 * ���ܴ�������ֻ��ʹ�ö�̬��ʵ����
 * 
 * 
 * */
public class CollectionDemo1 {
	public static void main(String[] args) {
//		method1();
		
		//��������
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		//ת���ɵ��������������ṩ��������
		Iterator it=c.iterator();
		while(it.hasNext()){//�ж��Ƿ�ӵ����һ��Ԫ��
			System.out.println(it.next());//��ȡ��һ��Ԫ��
		}
		
	}

	private static void method1() {
		Collection c=new ArrayList();
		//��ӣ�����ֵboolean
		System.out.println("���Ԫ�أ�"+c.add("hello"));
		System.out.println("���Ԫ�أ�"+c.add("world"));
		//���
//		c.clear();
		//�ж��Ƿ����Ԫ��
		System.out.println("�Ƿ����Ԫ�أ�"+c.contains("hello"));
		//�ж��Ƿ�Ϊ��
		System.out.println("�Ƿ�Ϊ�գ�"+c.isEmpty());
		//ɾ��Ԫ��
//		System.out.println("ɾ��Ԫ�أ�"+c.remove("hello"));
		//��ȡ����
		System.out.println("��ȡ���ȣ�"+c.size());
		//��������
		Object[] o=c.toArray();
		System.out.print("�������飺");
		for(int i=0;i<o.length;i++){
			System.out.print(o[i]+",");
		}
		System.out.println();
		
		System.out.println("��ӡ���ϣ�"+c);
	}
}
