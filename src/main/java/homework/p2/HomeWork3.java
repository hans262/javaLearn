package homework.p2;

import java.util.ArrayList;
import java.util.regex.Pattern;

//1.定义ArrayList集合，存入多个字符串
//如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
//2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
//3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
public class HomeWork3 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("ab1");
		array.add("123ad");
		array.add("bca");
		array.add("dadfadf");
		array.add("dddaaa");
		array.add("你好啊");
		array.add("我来啦");
		array.add("别跑啊");
		for(int i=0;i<array.size();i++){
			if(array.get(i).length()>5){
				array.remove(i);
				i--;
			}
			Pattern p = Pattern.compile("[0-9]");
            java.util.regex.Matcher m = p.matcher(array.get(i));
            if(m.find()){
            	array.remove(i);
            	i--;
            }
		}
		System.out.println(array);
	}
}
