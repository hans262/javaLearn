package homework.p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
1.����List���ϣ��������ַ���
2.ɾ������Ԫ���ַ����а���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
3.Ȼ�����õ�������������Ԫ�ز����
*/
public class HomeWork3 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hello52");
		list.add("wor");
		list.add("dwag");
		list.add("h52");
		list.add("edw862");
		list.add("jakdw");
		
		ListIterator<String> lit=list.listIterator();
		while(lit.hasNext()){
			String s=lit.next();
			//�ж��Ƿ��������
			if(s.matches(".*[0-9]+.*")){
				lit.remove();
			}
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
	}
}
