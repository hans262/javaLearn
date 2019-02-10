package homework.p2;

import java.util.ArrayList;

//1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "qwe" "swd" "wwe"
//2.获取集合中索引为3的元素并打印
//3.遍历集合,碰到"def"元素时,"def"直接删除
//4.将集合中每个元素中的小写字母变成大写字母
//5.打印集合
public class HomeWork2 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("abc");
		array.add("def");
		array.add("efg");
		array.add("qwe");
		array.add("swd");
		array.add("wwe");
		for(int i=0;i<array.size();i++){
			if(array.get(i)=="def"){
				array.remove(i);
			}
			String s=array.get(i).toUpperCase();
			array.set(i, s);
		}
		System.out.println(array);
	}
}
