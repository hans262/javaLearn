package homework.p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1.����List���ϣ��������ַ���
2.ɾ���������ַ���"def"
3.Ȼ�����õ�������������Ԫ�ز����
*/
public class HomeWork2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("def");
		list.add("def");
		
		while(list.contains("def")){
			list.remove("def");
		}
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next().toUpperCase()+",");
		}
	}
}

