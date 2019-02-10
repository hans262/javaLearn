package collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		String[] arr={"张三丰","宋元桥","张无忌","应妮婷","张翠山","魔神谷"};
		ArrayList<String> array=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) array.add(arr[i]);
		System.out.println(array);
		for(int i=0;i<array.size();i++){
			if(array.get(i).startsWith("张")){
				System.out.print(array.get(i)+",");
			}
		}
	}
}
