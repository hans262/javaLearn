package collection.foreach;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ForEach��ǿforѭ��
 * 
 * ForEach,�����޸ļ��ϣ�����ᷢ�������޸��쳣
 * 
 * 
 * */
public class ForEachDemo {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("hello");
		c.add("world");
		c.add("java");
		for(String val:c){
			System.out.println(val.toUpperCase());
		}
	}
}
