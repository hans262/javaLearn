package homework.p8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
1.有如下代码：
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("a");
	list.add("a");
	list.add("c");
	list.add("c");
	list.add("a");
	list.add("d");
}
2.定义一个noRepeat()方法,要求对传递过来集合中进行元素去重
public static void noRepeat(List<String> al){

}
*/
public class HomeWork4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("a");
		noRepeat(list);
		System.out.println(list);
	}
	public static void noRepeat(List<String> list){
		for(int i=0;i<list.size()-1;i++){
			String s=list.get(i);
			//判i索引以后的元素是否和s相等
			for(int j=list.size()-1;j>i;j--){
				if(list.get(j).equals(s)){
					list.remove(j);
				}
			}
		}
	}
}

