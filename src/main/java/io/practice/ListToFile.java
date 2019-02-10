package io.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
 * 将list中的内容写入文件
 */
public class ListToFile {
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		BufferedWriter bw=new BufferedWriter(new FileWriter("list.txt"));
		for(int i=0; i<list.size(); i++){
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
