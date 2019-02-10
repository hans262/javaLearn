package homework.p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
1.定义List集合，存入多个字符串
2.删除集合元素字符串中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
3.然后利用迭代器遍历集合元素并输出
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
			//判断是否包含数字
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
