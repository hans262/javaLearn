package homework.p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1.定义List集合，存入多个字符串
2.删除集合中字符串"def"
3.然后利用迭代器遍历集合元素并输出
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

