package collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("q");
		array.add("w");
		array.add("e");
		array.add("r");
		
		for(int i=0;i<array.size();i++){
			String s=array.get(i);
			System.out.print(s+",");
		}
	}
}
